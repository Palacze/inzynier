
package com.zunit.rlogger.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ace
 */
public abstract class BaseDAO<E, K> extends CommonDAO<E, K>{

	
	@PersistenceContext(unitName="rloggerClientPU")
	private EntityManager entityManager;
	
	protected BaseDAO(Class<E> entityClass) {
		super(entityClass);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	
}
