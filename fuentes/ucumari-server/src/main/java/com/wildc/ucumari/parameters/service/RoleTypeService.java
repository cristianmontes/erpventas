/**
 * 
 */
package com.wildc.ucumari.parameters.service;

import java.util.List;

import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.server.framework.service.UcumariServiceBase;

/**
 * @author Cristian
 *
 */
public interface RoleTypeService extends UcumariServiceBase<RoleType, String> {
	public List<RoleType> findByParentTypeId(RoleType roleType);

}
