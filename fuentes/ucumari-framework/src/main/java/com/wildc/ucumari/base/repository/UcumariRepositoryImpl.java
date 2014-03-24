package com.wildc.ucumari.base.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class UcumariRepositoryImpl<T, ID extends Serializable>
	extends SimpleJpaRepository<T, ID> implements UcumariRepository<T, ID> {

	private EntityManager entityManager;

	public UcumariRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);

		// This is the recommended method for accessing inherited class dependencies.
		this.entityManager = entityManager;
	}

	public List<T> ejecutarHQL(String hql, List<Object> params){
		System.out.println("query "  + hql);
		System.out.println("params "  + params);
          
		Query query = entityManager.createQuery(hql);
		if(params != null){
			for(int i=0; i<params.size(); i++){
				System.out.println("set params "  + i +" en: " + params.get(i));
				query.setParameter(i+1, params.get(i));
			}
		}
	
		return query.getResultList();
	}
}


