package com.ys.api.shop.controller;

import java.io.Console;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ys.api.entity.Member;
import com.ys.api.vo.LoginVo;
import com.ys.common.result.CodeMsg;
import com.ys.common.result.Result;

@Controller
@RequestMapping("/member")
public class ApiMemberController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "member/login";
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	@ResponseBody
	public Result<String> doLogin(@Valid LoginVo loginVo) {
		System.out.println(loginVo.getMobile() + "  " + loginVo.getPassword());
        if (loginVo.getPassword().equals("123456")) {
			return Result.success("登录成功了！！！！！！");
		} else {
			return Result.error(CodeMsg.PASSWORD_WRONG);
		}

	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		System.out.println("01010100000000");
		return "member/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
	public Result<String> register(@Valid Member member) {
		System.out.println(member);
		Result.success("测试成功了！！！！！！！！");
		return null;
	}
	
	
}
