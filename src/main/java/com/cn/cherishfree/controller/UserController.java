package com.cn.cherishfree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.cherishfree.entity.User;
import com.cn.cherishfree.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	@ResponseBody
	public List<User> getUser() {
		return userService.getUser();
	}
}
