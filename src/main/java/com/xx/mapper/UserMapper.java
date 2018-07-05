package com.xx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.xx.pojo.User;

@Mapper
@Component
public interface UserMapper {

	List<User> findAll();
	
	User findbyName(User user);
	
	void add(User user);
	
	void update(User user);
	
	void delete(User user);
}
