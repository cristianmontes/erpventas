/**
 * 
 */
package com.wildc.ucumari.party.service;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.Person;
import com.wildc.ucumari.security.model.UserLogin;
import com.wildc.ucumari.server.framework.service.UcumariServiceBase;

/**
 * @author Cristian
 *
 */
public interface PartyService extends UcumariServiceBase<Party, String> {
	
	public void saveWorker(UserLogin userLogin, Person person);

}
