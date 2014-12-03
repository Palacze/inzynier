
package com.zunit.rlogger.client.service;

import com.zunit.rlogger.client.dto.CreateNewUserRequestDto;
import com.zunit.rlogger.client.dto.CreateNewUserResponseDto;
import com.zunit.rlogger.client.dto.SendLogRequestDto;
import com.zunit.rlogger.client.dto.SendLogResponseDto;

/**
 *
 * @author Ace
 */
public interface RemoteLoggerService {
    CreateNewUserResponseDto createUser(CreateNewUserRequestDto newUserDto);
    SendLogResponseDto sendLog(SendLogRequestDto request);
}
