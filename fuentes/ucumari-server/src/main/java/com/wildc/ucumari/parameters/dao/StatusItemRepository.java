/**
 * 
 */
package com.wildc.ucumari.parameters.dao;

import java.util.List;

import com.wildc.ucumari.base.repository.UcumariRepository;
import com.wildc.ucumari.parameters.model.StatusItem;

/**
 * @author Cristian
 *
 */
public interface StatusItemRepository extends UcumariRepository<StatusItem, String> {

	public List<StatusItem> findByStatusTypeId(String statusTypeId);
}
