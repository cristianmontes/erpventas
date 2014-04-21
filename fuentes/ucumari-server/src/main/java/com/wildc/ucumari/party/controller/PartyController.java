/**
 * 
 */
package com.wildc.ucumari.party.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildc.ucumari.base.util.Constantes;
import com.wildc.ucumari.party.model.Person;
import com.wildc.ucumari.party.service.PartyService;
import com.wildc.ucumari.party.service.PersonService;
import com.wildc.ucumari.security.model.UserLogin;
import com.wildc.ucumari.security.service.UserLoginService;
import com.wildc.ucumari.server.framework.controller.BaseController;
import com.wildc.ucumari.server.framework.to.BResult;

/**
 * @author Cristian
 *
 */
@Controller
@RequestMapping("party")
public class PartyController extends BaseController {
	
	@Autowired
	private PersonService personService;
	@Autowired
	private UserLoginService userLoginService;
	@Autowired
	private PartyService partyService;

	
	/**
	 * 
	 */
	public PartyController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "find/workers", method = RequestMethod.POST)
    @ResponseBody
    public List<Person> findWorkers() {
        return personService.findWorkers();
    }
	
	@RequestMapping(value = "save/worker", method = RequestMethod.POST)
    @ResponseBody
    public BResult saveWorker(@RequestBody UserLogin userLogin) {
		try{
			partyService.saveWorker(userLogin, userLogin.getPerson());
			return new BResult();
		}catch(Exception e){
			e.printStackTrace();
			BResult result = new BResult();
			result.setCodigo(Constantes.TaskStatus.ERROR.getCode());
			result.setMensaje(e.getMessage());
			return result;
		}
    }

	

}
