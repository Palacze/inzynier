
package com.zunit.rlogger.client.dto;

/**
 *
 * @author Ace
 */
public class SendLogResponseDto {
    
    private String status;
    private long logId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getLogId() {
        return logId;
    }

    public void setLogId(long logId) {
        this.logId = logId;
    }
    
    
}
