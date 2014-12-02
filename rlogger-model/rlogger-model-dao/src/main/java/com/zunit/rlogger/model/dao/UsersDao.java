
package com.zunit.rlogger.model.dao;

import com.zunit.rlogger.model.Users;
import javax.ejb.Stateless;

/**
 *
 * @author Ace
 */
@Stateless
public class UsersDao extends BaseDAO<Users, Long>{
    
     public UsersDao(){
                super(Users.class);
        }
    
}
