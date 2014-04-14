/**
 * 
 */
package com.wildc.ucumari.party.service;

import java.util.List;

import com.wildc.ucumari.party.model.Person;
import com.wildc.ucumari.server.framework.service.UcumariServiceBase;

/**
 * @author Cristian
 *
 */
public interface PersonService extends UcumariServiceBase<Person, String> {
	public List<Person> findWorkers();

}
