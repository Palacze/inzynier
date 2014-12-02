
package com.zunit.rlogger.client.web.ws.facade;
import com.zunit.rlogger.client.dto.CreateNewUserRequestDto;
import com.zunit.rlogger.client.dto.CreateNewUserResponseDto;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "RemoteLoggerWs", targetNamespace = "com.inz.logger")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RemoteLoggerWsService {
    
    @WebMethod(operationName = "echo")
    public String echo(String message);
    
    @WebMethod(operationName = "createUser")
    public CreateNewUserResponseDto createUser(CreateNewUserRequestDto newUserDto);
    
}