/**
 * 
 */
package com.wildc.ucumari.security.dao;

import java.util.List;

import com.wildc.ucumari.base.repository.UcumariRepository;
import com.wildc.ucumari.security.model.UserLogin;

/**
 * @author Cristian
 *
 */
public interface UserLoginRepository extends UcumariRepository<UserLogin, String> {

	public List<UserLogin> findByUserLoginIdAndCurrentPasswordAndPartyCompanyId(String userLoginId, String currentPassword, String partyCompanyId);
}
