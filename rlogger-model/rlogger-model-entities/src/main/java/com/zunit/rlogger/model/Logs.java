
package com.zunit.rlogger.model;

import com.zunit.rlogger.utils.LogType;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ace
 */
@Entity
@Table(name = "logs")
public class Logs implements Serializable{
    
    private long logId;
    private Users user;
    private String logVersion;
    private Date logDate;
    private String logTxt;
    private LogType logType;
    private String testerName;
    private String operationName;
    private String className;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id", unique = true, nullable = false)
    public long getLogId() {
        return logId;
    }
    public void setLogId(long logId) {
        this.logId = logId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }

    @Column(name = "log_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLogDate() {
        return logDate;
    }
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    @Column(name = "log_txt", length = 511, nullable = false)
    public String getLogTxt() {
        return logTxt;
    }
    public void setLogTxt(String logTxt) {
        this.logTxt = logTxt;
    }

    @Column(name = "log_type", nullable = false)
    @Enumerated(EnumType.STRING)
    public LogType getLogType() {
        return logType;
    }
    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    @Column(name = "log_version", length = 255)
    public String getLogVersion() {
        return logVersion;
    }

    public void setLogVersion(String logVersion) {
        this.logVersion = logVersion;
    }

    @Column(name = "tester_name", length = 255)
    public String getTesterName() {
        return testerName;
    }

    public void setTesterName(String testerName) {
        this.testerName = testerName;
    }

    @Column(name = "operation_name", length = 255)
    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    @Column(name = "class_name", length = 255)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
}
