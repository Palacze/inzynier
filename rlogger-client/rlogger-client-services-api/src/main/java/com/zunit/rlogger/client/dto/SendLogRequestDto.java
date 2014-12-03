
package com.zunit.rlogger.client.dto;

import java.util.Date;

/**
 *
 * @author Ace
 */
public class SendLogRequestDto {
    private long userId;
    private Date logDate;
    private String logTxt;
    private String logType;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public String getLogTxt() {
        return logTxt;
    }

    public void setLogTxt(String logTxt) {
        this.logTxt = logTxt;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }
    
    
}
