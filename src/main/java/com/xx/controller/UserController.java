package com.xx.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xx.pojo.JSONResult;
import com.xx.pojo.User;

@RestController   //@RestController =@Controller+@ResponseBody
@RequestMapping("/user")
public class UserController {

	
	@RequestMapping("/getuser")
	public JSONResult getuser() throws ParseException {
		String string = "2016-10-24 21:59:06";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		
		User user=new User();
		user.setUsername(null);
		user.setPassword("123");
		user.setBirthday(sdf.parse(string));
		return JSONResult.ok(user);
	}
	
}
