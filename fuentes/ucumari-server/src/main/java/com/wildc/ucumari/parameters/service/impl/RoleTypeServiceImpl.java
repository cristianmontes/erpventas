/**
 * 
 */
package com.wildc.ucumari.parameters.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildc.ucumari.parameters.dao.RoleTypeRepository;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.service.RoleTypeService;

/**
 * @author P018906
 *
 */
@Service("roleTypeService")
public class RoleTypeServiceImpl implements RoleTypeService {
	
	@Autowired
	private RoleTypeRepository roleTypeRepository;

	/**
	 * 
	 */
	public RoleTypeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#load(java.io.Serializable)
	 */
	@Override
	public RoleType load(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#update(java.io.Serializable)
	 */
	@Override
	public void update(RoleType entity) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#save(java.io.Serializable)
	 */
	@Override
	public void save(RoleType entity) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#delete(java.io.Serializable)
	 */
	@Override
	public void delete(RoleType entity) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.wildc.ucumari.server.framework.service.UcumariServiceBase#findAll()
	 */
	@Override
	public List<RoleType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleType> findByParentTypeId(RoleType roleType) {
		// TODO Auto-generated method stub
		return roleTypeRepository.findByParentTypeId(roleType.getParentTypeId());
	}

}
