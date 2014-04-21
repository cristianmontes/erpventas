/**
 * 
 */
package com.wildc.ucumari.party.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildc.ucumari.party.dao.PersonRepository;
import com.wildc.ucumari.party.model.Person;
import com.wildc.ucumari.party.service.PersonService;

/**
 * @author Cristian
 *
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	/**
	 * 
	 */
	public PersonServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#load(java.io.Serializable)
	 */
	@Override
	public Person load(String id) {
		// TODO Auto-generated method stub
		return personRepository.findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#update(java.io.Serializable)
	 */
	@Override
	public void update(Person entity) {
		// TODO Auto-generated method stub
		personRepository.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#save(java.io.Serializable)
	 */
	@Override
	public void save(Person entity) {
		// TODO Auto-generated method stub
		personRepository.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#delete(java.io.Serializable)
	 */
	@Override
	public void delete(Person entity) {
		// TODO Auto-generated method stub
		personRepository.delete(entity);
	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#findAll()
	 */
	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Person> findWorkers(){
		/*
		 * select per.* from party par, person per, party_relationship pr, role_type rt  where per.PARTY_ID = par.PARTY_ID
and par.PARTY_ID = pr.PARTY_ID_TO and pr.ROLE_TYPE_ID_TO = rt.ROLE_TYPE_ID and rt.PARENT_TYPE_ID = 'EMPLOYEE';
		 * */
		String hql = "select entity.partyRole.party.person from PartyRelationship entity where entity.partyRole.roleType.parentTypeId = 'EMPLOYEE'";
		return personRepository.ejecutarHQL(hql, null);		
	}

}
