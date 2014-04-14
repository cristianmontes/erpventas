/**
 * 
 */
package com.wildc.ucumari.party.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildc.ucumari.party.model.Person;
import com.wildc.ucumari.party.service.PersonService;
import com.wildc.ucumari.server.framework.controller.BaseController;

/**
 * @author Cristian
 *
 */

public class PersonController extends BaseController {
	/*
	@Autowired
	private PersonService personService;*/

	/**
	 * 
	 */
	public PersonController() {
		// TODO Auto-generated constructor stub
	}
	/*
	@RequestMapping(value = "find/workers", method = RequestMethod.POST)
    @ResponseBody
    public List<Person> findWorkers() {
        return personService.findWorkers();
    }*/

}
