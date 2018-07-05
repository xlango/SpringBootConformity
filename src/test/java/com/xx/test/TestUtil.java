package com.xx.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.xx.pojo.User;
import com.xx.service.impl.UserServiceImpl;

public class TestUtil {

	@Resource
	private UserServiceImpl userService;
	
	@Test
	public void test() {
		for(User user:userService.findAll()) {
			System.out.println(user.getName());
		}
		
	}
}
