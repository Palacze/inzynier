
package com.zunit.rlogger.model.dao;

import com.zunit.rlogger.model.Logs;

/**
 *
 * @author Ace
 */
public class LogsDAO extends BaseDAO<Logs, Long>{
    public LogsDAO(){
                super(Logs.class);
        }
}
