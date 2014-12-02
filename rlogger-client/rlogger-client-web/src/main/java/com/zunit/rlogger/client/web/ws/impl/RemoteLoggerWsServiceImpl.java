package com.zunit.rlogger.client.web.ws.impl;





import com.zunit.rlogger.client.dto.CreateNewUserRequestDto;
import com.zunit.rlogger.client.dto.CreateNewUserResponseDto;
import com.zunit.rlogger.client.service.RemoteLoggerService;
import com.zunit.rlogger.client.web.ws.facade.RemoteLoggerWsService;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author Ace
 */
@WebService(serviceName = "RemoteLoggerWsService",
        portName = "RemoteLoggerWsServicePort",
        targetNamespace = "com.inz.logger",
        endpointInterface = "com.zunit.rlogger.client.web.ws.facade.RemoteLoggerWsService")
public class RemoteLoggerWsServiceImpl implements RemoteLoggerWsService{
    @EJB
    private RemoteLoggerService remoteLoggerService;

    @Override
    public String echo(String message) {
        return message;
    }

    @Override
    public CreateNewUserResponseDto createUser(CreateNewUserRequestDto newUserDto) {
        return remoteLoggerService.createUser(newUserDto);
    }

    
}
