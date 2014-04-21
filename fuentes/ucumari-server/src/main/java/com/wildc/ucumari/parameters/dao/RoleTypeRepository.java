/**
 * 
 */
package com.wildc.ucumari.parameters.dao;

import java.util.List;

import com.wildc.ucumari.base.repository.UcumariRepository;
import com.wildc.ucumari.parameters.model.RoleType;

/**
 * @author Cristian
 *
 */
public interface RoleTypeRepository extends UcumariRepository<RoleType, String> {

	public List<RoleType> findByParentTypeId(String parentTypeId);
}
