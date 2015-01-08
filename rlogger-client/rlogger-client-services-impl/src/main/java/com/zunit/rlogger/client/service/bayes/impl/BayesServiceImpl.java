
package com.zunit.rlogger.client.service.bayes.impl;


import com.zunit.rlogger.client.service.bayes.BayesService;
import com.zunit.rlogger.model.Logs;
import com.zunit.rlogger.model.dao.LogsDAO;
import com.zunit.rlogger.utils.LogType;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Ace
 * Klasa implementująca interfejs BayesService
 */
public class BayesServiceImpl implements BayesService{
    @EJB
    private LogsDAO logDAO;
    @Override
    public double countBayesResultForList(List list, String userId, String logType) {
        long countOpTypes;
        long countClassNames;
        long countTestersNames;
        double result = 0;
        double temp;              
        
        countOpTypes = logDAO.countTypes(userId);
        countClassNames = logDAO.countClassName(userId);
        countTestersNames = logDAO.countTesters(userId);
        
        LogType type = LogType.valueOf(logType);
        
        switch(type){
            case ERROR:
                List<Logs> listError = logDAO.findByUserAndType(userId, LogType.ERROR.name());
                temp = logDAO.countLogsByTypeAndLogClass(userId, logType, LogType.ERROR.name()) + 1;
                temp = temp / countClassNames + listError.size();
                result = temp;
                
                temp = logDAO.countLogsByTypeAndLogVersion(userId, logType, LogType.ERROR.name()) + 1;
                temp = temp / countOpTypes + listError.size();
                result = result * temp;
                
                temp = logDAO.countLogsByTypeAndTesterName(userId, logType, LogType.ERROR.name()) + 1;
                temp = temp / countTestersNames + listError.size();
                result = result * temp;
                
                temp = logDAO.findByUserAndType(userId, LogType.ERROR.name()).size() + 1;
                temp = temp / 3 + list.size();
                result = result * temp;
                return result;
            case WARN:
                List<Logs> listWarn = logDAO.findByUserAndType(userId, LogType.WARN.name());
                temp = logDAO.countLogsByTypeAndLogClass(userId, logType, LogType.WARN.name()) + 1;
                temp = temp / countClassNames + listWarn.size();
                result = temp;
                
                temp = logDAO.countLogsByTypeAndLogVersion(userId, logType, LogType.WARN.name()) + 1;
                temp = temp / countOpTypes + listWarn.size();
                result = result * temp;
                
                temp = logDAO.countLogsByTypeAndTesterName(userId, logType, LogType.WARN.name()) + 1;
                temp = temp / countTestersNames + listWarn.size();
                result = result * temp;
                
                temp = logDAO.findByUserAndType(userId, LogType.WARN.name()).size() + 1;
                temp = temp / 3 + list.size();
                result = result * temp;
                return result;
            case INFO:
                List<Logs> listInfo = logDAO.findByUserAndType(userId, LogType.INFO.name());
                temp = logDAO.countLogsByTypeAndLogClass(userId, logType, LogType.INFO.name()) + 1;
                temp = temp / countClassNames + listInfo.size();
                result = temp;
                
                temp = logDAO.countLogsByTypeAndLogVersion(userId, logType, LogType.INFO.name()) + 1;
                temp = temp / countOpTypes + listInfo.size();
                result = result * temp;
                
                temp = logDAO.countLogsByTypeAndTesterName(userId, logType, LogType.INFO.name()) + 1;
                temp = temp / countTestersNames + listInfo.size();
                result = result * temp;
                
                temp = logDAO.findByUserAndType(userId, LogType.INFO.name()).size() + 1;
                temp = temp / 3 + list.size();
                result = result * temp;
                return result;
        }
        
        
        
        
        return result;
    }
    
}
