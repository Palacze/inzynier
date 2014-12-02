
package com.zunit.rlogger.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ace
 */
@Entity
@Table(name = "users")
public class Users implements Serializable{
    
    private long userId;
    private String userName;
    private String key;
    private boolean encrypt;
    private String userData;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    
    @Column(name = "user_name", length = 255, nullable = false)
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "key", length = 511, nullable = false)
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    @Column(name = "encrypy", nullable = false)
    public boolean isEncrypt() {
        return encrypt;
    }
    public void setEncrypt(boolean encrypt) {
        this.encrypt = encrypt;
    }

    @Column(name = "user_data", length = 511, nullable = false)
    public String getUserData() {
        return userData;
    }
    public void setUserData(String userData) {
        this.userData = userData;
    }  
}
