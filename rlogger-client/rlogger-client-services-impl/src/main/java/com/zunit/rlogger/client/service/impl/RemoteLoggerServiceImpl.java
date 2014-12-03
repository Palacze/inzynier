/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunit.rlogger.client.service.impl;

import com.zunit.rlogger.client.dto.CreateNewUserRequestDto;
import com.zunit.rlogger.client.dto.CreateNewUserResponseDto;
import com.zunit.rlogger.client.dto.SendLogRequestDto;
import com.zunit.rlogger.client.dto.SendLogResponseDto;
import com.zunit.rlogger.client.service.RemoteLoggerService;
import com.zunit.rlogger.model.Logs;
import com.zunit.rlogger.model.Users;
import com.zunit.rlogger.model.dao.LogsDAO;
import com.zunit.rlogger.model.dao.UsersDao;
import com.zunit.rlogger.utils.LogType;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author Ace
 */
@Local
@Stateless
public class RemoteLoggerServiceImpl implements RemoteLoggerService{
    @EJB
    private UsersDao usersDao;
    @EJB
    private LogsDAO logsDAO;

    @Override
    public CreateNewUserResponseDto createUser(CreateNewUserRequestDto newUserDto) {
        CreateNewUserResponseDto dto = new CreateNewUserResponseDto();
        Users user = new Users();
        user.setEncrypt(newUserDto.isEncrypt());
        user.setKey(newUserDto.getKey());
        user.setUserData(newUserDto.getUserData());
        user.setUserName(newUserDto.getUserName());
        
        usersDao.persist(user);
        
        dto.setStatus("SUCCESS");
        dto.setUserId(user.getUserId());
        return dto;
    }

    @Override
    public SendLogResponseDto sendLog(SendLogRequestDto request) {
        SendLogResponseDto dto = new SendLogResponseDto();
        Logs log = new Logs();
        
        log.setLogDate(request.getLogDate());
        log.setLogTxt(request.getLogTxt());
        log.setLogType(LogType.valueOf(request.getLogType()));
        log.setUser(usersDao.findById(request.getUserId()));
        
        logsDAO.persist(log);
        
        dto.setLogId(log.getLogId());
        dto.setStatus("SUCCESS");
        
        return dto;
    }
    
}
