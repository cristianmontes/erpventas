/**
 * 
 */
package com.wildc.ucumari.security.service;

import java.util.List;

import com.wildc.ucumari.security.model.UserLogin;
import com.wildc.ucumari.server.framework.service.UcumariServiceBase;

/**
 * @author Cristian
 *
 */
public interface UserLoginService extends UcumariServiceBase<UserLogin, String> {

	public List<UserLogin> findByUserLoginIdAndCurrentPasswordAndPartyCompanyId(String userLoginId, String currentPassword, String partyCompanyId);
	public UserLogin login(UserLogin userLogin);
}
