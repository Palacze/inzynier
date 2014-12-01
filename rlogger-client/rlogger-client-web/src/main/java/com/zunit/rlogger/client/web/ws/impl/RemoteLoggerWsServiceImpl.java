package com.zunit.rlogger.client.web.ws.impl;





import com.zunit.rlogger.client.web.ws.facade.RemoteLoggerWsService;
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

    @Override
    public String echo(String message) {
        return message;
    }

    
}
