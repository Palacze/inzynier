
package com.zunit.rlogger.model.dao;

import com.zunit.rlogger.model.Logs;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Ace
 */
public class LogsDAO extends BaseDAO<Logs, Long>{
    public LogsDAO(){
                super(Logs.class);
        }
    
    public List<Logs> findByUser(String userId){
        List<Logs> list = getEntityManager()
                .createQuery("SELECT l FROM Logs l WHERE l.user.userId = :userId", Logs.class)
                .setParameter("userId", userId)
                .getResultList();
        
        return list;
    }
    
    public Long countTesters(String userId){
        Query q = getEntityManager().createQuery("SELECT COUNT(DISTINCT l.testerName) FROM l Logs WHERE l.userIdn = :userIdn")
                .setParameter("userIdn", userId);
        return (Long) q.getSingleResult();
    }
    
    public Long countTypes(String userId){
        Query q = getEntityManager().createQuery("SELECT COUNT(DISTINCT l.operationName) FROM l Logs WHERE l.userIdn = :userIdn")
                .setParameter("userIdn", userId);
        return (Long) q.getSingleResult();
    }
    
    public Long countClassName(String userId){
        Query q = getEntityManager().createQuery("SELECT COUNT(DISTINCT l.className) FROM l Logs WHERE l.userIdn = :userIdn")
                .setParameter("userIdn", userId);
        return (Long) q.getSingleResult();
    }
    
    public List<Logs> findByUserAndType(String userId, String clas){
        List<Logs> list = getEntityManager()
                .createQuery("SELECT l FROM Logs l WHERE l.user.userId = :userId AND l.logType = :type", Logs.class)
                .setParameter("userId", userId)
                .setParameter("type", clas)
                .getResultList();
        
        return list;
    }
    
    public Long countLogsByTypeAndLogVersion(String userId, String atribute, String logType){
        Query q = getEntityManager().createQuery("SELECT COUNT(l) FROM l Logs WHERE l.userIdn = :userIdn AND l.logType = :logType AND l.operationName = :atribute")
                .setParameter("userIdn", userId)
                .setParameter("logType", logType)
                .setParameter("atribute", atribute);
        
        return (Long) q.getSingleResult();
    }
    
    public Long countLogsByTypeAndLogClass(String userId, String atribute, String logType){
        Query q = getEntityManager().createQuery("SELECT COUNT(l) FROM l Logs WHERE l.userIdn = :userIdn AND l.logType = :logType AND l.className = :atribute")
                .setParameter("userIdn", userId)
                .setParameter("logType", logType)
                .setParameter("atribute", atribute);
        
        return (Long) q.getSingleResult();
    }
    
    public Long countLogsByTypeAndTesterName(String userId, String atribute, String logType){
        Query q = getEntityManager().createQuery("SELECT COUNT(l) FROM l Logs WHERE l.userIdn = :userIdn AND l.logType = :logType AND l.testerName = :atribute")
                .setParameter("userIdn", userId)
                .setParameter("logType", logType)
                .setParameter("atribute", atribute);
        
        return (Long) q.getSingleResult();
    }
}
