/**
 * 
 */
package com.wildc.ucumari.security.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildc.ucumari.security.model.UserLogin;
import com.wildc.ucumari.security.service.UserLoginService;
import com.wildc.ucumari.server.framework.controller.BaseController;

/**
 * @author Cristian
 *
 */
@Controller
@RequestMapping("security")
public class SecurityController extends BaseController{
	
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private UserLoginService userLoginService;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public List<UserLogin> findAll() {
        return userLoginService.findAll();
    }
	
	@RequestMapping(value = "login/{userLoginId}/{currentPassword}/{partyCompanyId}", method = RequestMethod.GET)
    @ResponseBody
    public List<UserLogin> findByLogin(@PathVariable String userLoginId,
    		@PathVariable String currentPassword, @PathVariable String partyCompanyId) {
        return userLoginService.findByUserLoginIdAndCurrentPasswordAndPartyCompanyId(userLoginId, currentPassword, partyCompanyId);
    }
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public UserLogin login(@RequestBody UserLogin userLogin) {
        return userLoginService.login(userLogin);
    }
	
	@RequestMapping(value = "test", method = RequestMethod.POST)
    @ResponseBody
    public UserLogin test(@RequestBody UserLogin userLogin, HttpServletResponse response) {
      
		System.out.println("session controller " + request.getHeader("session"));
		
		System.out.println("cadena de entrada " + userLogin.getUserLoginId());
		userLogin.setUserLoginId("cambiado");
		//response.addHeader("seed", "1a21sd21asfdas21");
		//response.addHeader("session", "msmsmc545454");
		return userLogin;
    }

	

}
