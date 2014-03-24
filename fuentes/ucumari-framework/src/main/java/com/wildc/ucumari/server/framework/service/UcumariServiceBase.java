/**
 * 
 */
package com.wildc.ucumari.server.framework.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author cmontes
 *
 */
public interface UcumariServiceBase<DomainObject extends Serializable, KeyType extends Serializable> {
	
	public DomainObject load(KeyType id);
	public void update(DomainObject entity);	       
	public void save(DomainObject entity);
	public void delete(DomainObject entity);
	public List<DomainObject> findAll();
	

}
