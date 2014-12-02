
package com.zunit.rlogger.client.service;

import com.zunit.rlogger.client.dto.CreateNewUserRequestDto;
import com.zunit.rlogger.client.dto.CreateNewUserResponseDto;

/**
 *
 * @author Ace
 */
public interface RemoteLoggerService {
    CreateNewUserResponseDto createUser(CreateNewUserRequestDto newUserDto);
}
