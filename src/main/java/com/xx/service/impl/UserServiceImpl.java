package com.xx.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.xx.mapper.UserMapper;
import com.xx.pojo.User;
import com.xx.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
    
	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {		
		return userMapper.findAll();
	}

	@Override
	public User findbyName(User user) {
		return userMapper.findbyName(user);
	}

	@Override
	public void add(User user) {
		userMapper.add(user);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
	}

	@Override
	public void delete(User user) {
		userMapper.delete(user);
	}

	@Override
	public List<User> pageuser(Integer page, Integer pageSize) {
		//开始分页
		PageHelper.startPage(page, pageSize);
		return userMapper.findAll();
	}

}
