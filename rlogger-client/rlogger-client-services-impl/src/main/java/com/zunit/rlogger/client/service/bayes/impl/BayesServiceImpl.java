
package com.zunit.rlogger.client.service.bayes.impl;

import com.zunit.rlogger.client.service.bayes.BayesService;
import com.zunit.rlogger.model.dao.LogsDAO;
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
    public List<Object> getListObjectsByClass(String klasa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
