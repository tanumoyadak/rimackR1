package com.rad.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.rad.model.User;

@Service
public class LoginService {

	public void register(String userName, String emailId, String password, Long phoneNo){
		User user = new User();
		user.setUsername(userName);
		user.setPassword(password);
		user.setEmail(emailId);
		user.setPhoneNo(phoneNo);
		user.setCreatedByName(userName);
		
		long millis = System.currentTimeMillis();
		
		user.setCreatedDate(new java.util.Date(millis));
	}
}
