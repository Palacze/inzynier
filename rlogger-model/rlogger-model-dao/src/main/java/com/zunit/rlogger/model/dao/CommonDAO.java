
package com.zunit.rlogger.model.dao;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Ace
 */
public abstract class CommonDAO<E, K> {
	
	private Class<E> entityClass;
	
	protected CommonDAO(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	public void persist(E entity) {
		getEntityManager().persist(entity);
	}
	
	public void remove(E entity) {
		getEntityManager().remove(entity);

	}

	public E merge(E entity) {
		return getEntityManager().merge(entity);

	}

	public E findById(K key) {
		return getEntityManager().find(entityClass, key);
	}
	
	public List<E> listAll() {
		return getEntityManager()
		.createQuery("FROM "+this.entityClass.getName()+" ec ORDER BY 1", this.entityClass)
		.getResultList();
	}
	
	public List<E> listAll(int page, int maxRows) {
		TypedQuery<E> tq = getEntityManager().createQuery("FROM "+this.entityClass.getName()+" ec ORDER BY 1", this.entityClass);
		tq.setFirstResult((page - 1) * maxRows);
		tq.setMaxResults(maxRows);
		return tq.getResultList();
	}
	
	protected abstract EntityManager getEntityManager();

	public void persistAll(Collection<E> entityCollections){
		for (E entity : entityCollections) {
			persist(entity);
		}
	}

	public long countAll() {
		return getEntityManager()
		.createQuery("SELECT COUNT(o) FROM " + entityClass.getName() + " o", Long.class)
		.getSingleResult();
	}
}
