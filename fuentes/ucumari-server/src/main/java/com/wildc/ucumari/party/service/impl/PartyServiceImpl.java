/**
 * 
 */
package com.wildc.ucumari.party.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildc.ucumari.base.util.Constantes;
import com.wildc.ucumari.base.util.Util;
import com.wildc.ucumari.parameters.dao.StatusItemRepository;
import com.wildc.ucumari.party.dao.PartyRelationshipRepository;
import com.wildc.ucumari.party.dao.PartyRelationshipTypeRepository;
import com.wildc.ucumari.party.dao.PartyRepository;
import com.wildc.ucumari.party.dao.PartyRoleRepository;
import com.wildc.ucumari.party.dao.PartyTypeRepository;
import com.wildc.ucumari.party.dao.PersonRepository;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRelationship;
import com.wildc.ucumari.party.model.PartyRelationshipPK;
import com.wildc.ucumari.party.model.PartyRole;
import com.wildc.ucumari.party.model.PartyRolePK;
import com.wildc.ucumari.party.model.Person;
import com.wildc.ucumari.party.service.PartyService;
import com.wildc.ucumari.security.dao.UserLoginRepository;
import com.wildc.ucumari.security.model.UserLogin;

/**
 * @author Cristian
 *
 */
@Service("partyService")
public class PartyServiceImpl implements PartyService {
	
	@Autowired
	private PartyRepository partyRepository;
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private PartyTypeRepository partyTypeRepository;
	@Autowired
	private PartyRoleRepository partyRoleRepository;
	@Autowired
	private StatusItemRepository statusItemRepository;
	@Autowired
	private PartyRelationshipRepository partyRelationshipRepository;
	@Autowired
	private UserLoginRepository userLoginRepository;
	@Autowired
	private PartyRelationshipTypeRepository partyRelationshipTypeRepository;
	

	/**
	 * 
	 */
	public PartyServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#load(java.io.Serializable)
	 */
	@Override
	public Party load(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#update(java.io.Serializable)
	 */
	@Override
	public void update(Party entity) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#save(java.io.Serializable)
	 */
	@Override
	public void save(Party entity) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#delete(java.io.Serializable)
	 */
	@Override
	public void delete(Party entity) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#findAll()
	 */
	@Override
	public List<Party> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveWorker(UserLogin userLogin, Person person) {
		// TODO Auto-generated method stub
		//Grabando el Party
		Party party = new Party();
		party.setPartyTypeId(partyTypeRepository.findOne(Constantes.PartyType.PERSON.getCode()));
		party.setStatusId(statusItemRepository.findOne(Constantes.StatusItem.PARTY_ENABLED.getCode()));
		party.setCreatedDate(Util.currentDate());
		party.setLastModifiedDate(Util.currentDate());
		party.setLastUpdatedStamp(Util.currentDate());
		party.setLastUpdatedTxStamp(Util.currentDate());
		party.setCreatedStamp(Util.currentDate());
		party.setCreatedTxStamp(Util.currentDate());
		//party.setPerson(person);
		partyRepository.save(party);
		
		//Grabando la Persona		
		person.setPartyId(party.getPartyId());
		person.setLastUpdatedStamp(Util.currentDate());
		person.setLastUpdatedTxStamp(Util.currentDate());
		person.setCreatedStamp(Util.currentDate());
		person.setCreatedTxStamp(Util.currentDate());
		personRepository.save(person);
		
		//Grabando el Rol
		PartyRolePK partyRolePK = new PartyRolePK();
		partyRolePK.setPartyId(party.getPartyId());
		//partyRolePK.setRoleTypeId(Constantes.RoleType.EMPLOYEE.getCode());
		partyRolePK.setRoleTypeId(person.getRoleTypeId());
		PartyRole partyRole = new PartyRole();
		partyRole.setPartyRolePK(partyRolePK);
		partyRole.setLastUpdatedStamp(Util.currentDate());
		partyRole.setLastUpdatedTxStamp(Util.currentDate());
		partyRole.setCreatedStamp(Util.currentDate());
		partyRole.setCreatedTxStamp(Util.currentDate());
		partyRoleRepository.save(partyRole);
		
		//Para las relaciones con la empresa
		PartyRelationshipPK  partyRelationshipPK = new PartyRelationshipPK();
		partyRelationshipPK.setPartyIdFrom(userLogin.getPartyCompanyId());
		partyRelationshipPK.setRoleTypeIdFrom(Constantes.RoleType.NA.getCode());
		partyRelationshipPK.setPartyIdTo(party.getPartyId());
		partyRelationshipPK.setRoleTypeIdTo(partyRolePK.getRoleTypeId());
		partyRelationshipPK.setFromDate(Util.currentDate());
		
		PartyRelationship partyRelationship = new PartyRelationship();
		partyRelationship.setPartyRelationshipPK(partyRelationshipPK);
		partyRelationship.setPartyRelationshipTypeId(partyRelationshipTypeRepository.findOne(Constantes.PartyRelationshipType.EMPLOYMENT.getCode()));
		partyRelationship.setLastUpdatedStamp(Util.currentDate());
		partyRelationship.setLastUpdatedTxStamp(Util.currentDate());
		partyRelationship.setCreatedStamp(Util.currentDate());
		partyRelationship.setCreatedTxStamp(Util.currentDate());		
		partyRelationshipRepository.save(partyRelationship);
		
		//Grabando datos para el logueo
		userLogin.setPartyId(party);
		userLogin.setLastUpdatedStamp(Util.currentDate());
		userLogin.setLastUpdatedTxStamp(Util.currentDate());
		userLogin.setCreatedStamp(Util.currentDate());
		userLogin.setCreatedTxStamp(Util.currentDate());
		userLoginRepository.save(userLogin);
	}

}
