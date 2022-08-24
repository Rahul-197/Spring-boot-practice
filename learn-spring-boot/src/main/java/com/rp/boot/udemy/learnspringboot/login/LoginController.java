package com.rp.boot.udemy.learnspringboot.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private Logger logger =LoggerFactory.getLogger(getClass());
	
	//whenever you pass anything from your controller to jsp file putting in to a modelMap and add atribute in jasp file by ${}
	/*
	 * @RequestMapping("login") public String GotoLoginPage(@RequestParam String
	 * name,ModelMap model) { logger.debug("request param is : "+ name);
	 * logger.info("i want to login infro "+name);
	 * logger.warn("i want to login warm"); model.put("name", name); return
	 * "login";//<==jsp file name }
	 */
	@RequestMapping("UserLogin")
    public String GotoUserLoginPage()
    {
    	return "UserLogin";//<==jsp file name
    }
}
