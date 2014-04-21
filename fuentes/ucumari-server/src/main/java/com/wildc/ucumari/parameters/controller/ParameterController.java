package com.wildc.ucumari.parameters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.service.RoleTypeService;
import com.wildc.ucumari.server.framework.controller.BaseController;



@Controller
@RequestMapping("parameter")
public class ParameterController extends BaseController{
	
	@Autowired
	private RoleTypeService roleTypeService;
	
	@RequestMapping(value = "findByParentTypeId", method = RequestMethod.POST)
    @ResponseBody
    public List<RoleType> findByParentTypeId(@RequestBody RoleType roleType) {
        return roleTypeService.findByParentTypeId(roleType);
    }

}
