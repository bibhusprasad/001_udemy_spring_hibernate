package com.crm.controller.login;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.service.LoginDetailsService;


@Controller
public class LoginController {
	
	private static final Logger LOG = Logger.getLogger(LoginController.class);
	
	@Autowired
	private LoginDetailsService loginDetailsService;
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/")
	public String mainPage() {
		LOG.debug("CRM::LoginController : main page loading.");
		return "login/index";
	}
	
	@RequestMapping("/login/loginRegister.do")
	public String getRegistrationPage(Model model) {
		LOG.debug("CRM::LoginController : user registraction page.");
		model.addAttribute("registration", new Registration());
		return "login/registraction-page";
	}
	
	@RequestMapping("/login/saveLoginDetails.do")
	public String saveLoginDetails(@Valid @ModelAttribute("registration") Registration registration, BindingResult bindingResult) {
		LOG.debug("CRM::LoginController : submit user registraction details.");
		if(bindingResult.hasErrors()) {
			return "login/registraction-page";
		} else {
			try {
				loginDetailsService.saveLoginDetailsService(registration);
			}catch(Exception e) {
				return "login/login-failed";
			}
			return "login/registraction-success";
		}
	}
	
	@RequestMapping("/login/loginWelcome.do")
	public String getLoginPage(Model model) {
		LOG.debug("CRM::LoginController : user login page.");
		model.addAttribute("login", new Login());
		return "login/login-page";
	}
	
	@RequestMapping("/login/loginUser.do")
	public String logedInUser(@Valid @ModelAttribute("login") Login login, BindingResult bindingResult) {
		LOG.debug("CRM::LoginController : submit user login details.");
		if(bindingResult.hasErrors()) {
			return "login/login-page";
		} else {
			try {
				Login result = loginDetailsService.fetchLoginDetailsService(login);
				if(null == result) {
					return "login/login-wrong-id";
				}
			}catch(Exception e) {
				return "login-failed";
			}
			return "login/login-success";
		}
	}

	
	@RequestMapping("/login/loginForgetPassword.do")
	public String resetPassword(Model model) {
		LOG.debug("CRM::LoginController : user login page.");
		model.addAttribute("forgot", new ForgotPassword());
		return "login/forgot-password-page";
	}
	
	@RequestMapping("/login/forgotPassword.do")
	public String resetPasswordController(@Valid @ModelAttribute("forgot") ForgotPassword forgotPassword, BindingResult bindingResult) {
		LOG.debug("CRM::LoginController : submit user registraction details.");
		if(bindingResult.hasErrors()) {
			return "login/forgot-password-page";
		} else {
			try {
				Login result = loginDetailsService.resetLoginPasswordService(forgotPassword);
				if(null == result) {
					return "login/login-wrong-id";
				} 
			}catch(Exception e) {
				return "login/login-failed";
			}
			return "login/forgot-password-retrived";
		}
	}
	
	public LoginDetailsService getLoginDetailsService() {
		return loginDetailsService;
	}

	public void setLoginDetailsService(LoginDetailsService loginDetailsService) {
		this.loginDetailsService = loginDetailsService;
	}
	
}
