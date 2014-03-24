/**
 * 
 */
package com.wildc.ucumari.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildc.ucumari.base.util.Constantes;
import com.wildc.ucumari.base.util.Util;
import com.wildc.ucumari.security.dao.UserLoginHistoryRepository;
import com.wildc.ucumari.security.dao.UserLoginRepository;
import com.wildc.ucumari.security.model.UserLogin;
import com.wildc.ucumari.security.model.UserLoginHistory;
import com.wildc.ucumari.security.model.UserLoginHistoryPK;
import com.wildc.ucumari.security.service.UserLoginService;

/**
 * @author Cristian
 *
 */
@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
    private UserLoginRepository userLoginRepository;
	@Autowired
    private UserLoginHistoryRepository userLoginHistoryRepository;
	
	public UserLogin load(String id) {
		// TODO Auto-generated method stub
		return userLoginRepository.findOne(id);
	}

	
	public void update(UserLogin entity) {
		// TODO Auto-generated method stub
		userLoginRepository.save(entity);
	}

	
	public void save(UserLogin entity) {
		// TODO Auto-generated method stub
		userLoginRepository.save(entity);
	}

	
	public void delete(UserLogin entity) {
		// TODO Auto-generated method stub
		userLoginRepository.delete(entity);
	}


	public List<UserLogin> findByUserLoginIdAndCurrentPasswordAndPartyCompanyId(
			String userLoginId, String currentPassword, String partyCompanyId) {
		// TODO Auto-generated method stub
		return userLoginRepository.findByUserLoginIdAndCurrentPasswordAndPartyCompanyId(userLoginId,currentPassword,partyCompanyId);
	}
	


	public List<UserLogin> findAll() {
		// TODO Auto-generated method stub
		return userLoginRepository.findAll();
	}


	@Override
	public UserLogin login(UserLogin userLogin) {
		
		List<UserLogin> listUser = userLoginRepository.
				findByUserLoginIdAndCurrentPasswordAndPartyCompanyId(userLogin.getUserLoginId(),
						userLogin.getCurrentPassword(),userLogin.getPartyCompanyId());
		
		UserLoginHistoryPK userLoginHistoryPK = new UserLoginHistoryPK();
		userLoginHistoryPK.setUserLoginId(userLogin.getUserLoginId());
		userLoginHistoryPK.setFromDate(Util.currentDate());
		
		UserLoginHistory userLoginHistory = new UserLoginHistory();
		userLoginHistory.setUserLoginHistoryPK(userLoginHistoryPK);
		userLoginHistory.setPasswordUsed(userLogin.getCurrentPassword());
		
		userLoginHistory.setLastUpdatedStamp(Util.currentDate());
		userLoginHistory.setLastUpdatedTxStamp(Util.currentDate());
		userLoginHistory.setCreatedStamp(Util.currentDate());
		userLoginHistory.setCreatedTxStamp(Util.currentDate());
		userLoginHistory.setPartyId(userLogin.getUserLoginId());
		userLoginHistory.setPartyCompanyId(userLogin.getPartyCompanyId());
		
		if(listUser != null && listUser.size()>0){
			
			userLoginHistory.setSuccessfulLogin(Constantes.Successful.YES.getCode());
			userLoginHistoryRepository.save(userLoginHistory);
			return listUser.get(0);
		}else{
			
			userLoginHistory.setSuccessfulLogin(Constantes.Successful.NO.getCode());
			userLoginHistoryRepository.save(userLoginHistory);
		
			return null;
		}
	}

}
