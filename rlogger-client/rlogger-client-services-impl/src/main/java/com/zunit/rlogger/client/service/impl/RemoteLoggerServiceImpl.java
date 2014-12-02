/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunit.rlogger.client.service.impl;

import com.zunit.rlogger.client.dto.CreateNewUserRequestDto;
import com.zunit.rlogger.client.dto.CreateNewUserResponseDto;
import com.zunit.rlogger.client.service.RemoteLoggerService;
import com.zunit.rlogger.model.Users;
import com.zunit.rlogger.model.dao.UsersDao;
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
    
}
