
package com.zunit.rlogger.client.dto;

/**
 *
 * @author Ace
 */
public class CreateNewUserRequestDto {
    
    private String userName;
    private String key;
    private boolean encrypt;
    private String userData;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isEncrypt() {
        return encrypt;
    }

    public void setEncrypt(boolean encrypt) {
        this.encrypt = encrypt;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    
}
