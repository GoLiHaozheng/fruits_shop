package com.ys.api.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ys.api.entity.RegisterEntity;
import com.ys.api.shop.service.RegisterService;

@Controller
@RequestMapping("/Register")
public class ApiUserController {
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value="",method=RequestMethod.GET)
    @ResponseBody
    public String doPrint(){
		System.out.println(registerService.save().toString());
		return registerService.save().toString();
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
    public String toLogin(){
		System.out.println("开始登陆");
		return "user/login";
	}
}
