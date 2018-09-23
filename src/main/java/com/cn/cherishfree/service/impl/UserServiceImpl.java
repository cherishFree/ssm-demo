package com.cn.cherishfree.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cherishfree.dao.UserDao;
import com.cn.cherishfree.entity.User;
import com.cn.cherishfree.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUser() {
		return userDao.getUser();
//		return null;
	}

}
