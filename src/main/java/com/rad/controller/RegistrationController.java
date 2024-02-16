package com.rad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rad.service.LoginService;

@RestController
public class RegistrationController {

	@Autowired
	LoginService loginService;
	
	@PostMapping(value = "/loginAuthenticate")
	public ResponseEntity loginAuth(@RequestParam(name = "userName", required = true) String userName,
			@RequestParam(name = "password", required = true) String password) {
		System.out.println();

		return ResponseEntity.ok().build();
	}

	@PostMapping(value = "/postloginAuth")
	public ResponseEntity postLoginAuth(@RequestParam(name = "userName", required = true) String userName,
			@RequestParam(name = "sessionId", required = true) String sessionId) {
		System.out.println();

		return ResponseEntity.ok().build();
	}

	@PostMapping(value = "/signup")
	public ResponseEntity register(@RequestParam(name = "userName", required = true) String userName,
			@RequestParam(name = "emailId", required = true) String emailId,
			@RequestParam(name = "password", required = true) String password,
			@RequestParam(name = "phoneNo", required = true) Long phoneNo) {
		System.out.println();
		loginService.register(userName, emailId, password, phoneNo);
		return ResponseEntity.ok().build();
	}

}
