package com.agsft.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agsft.dto.LoginDto;
import com.agsft.service.LoginService;
import com.agsft.util.Response;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LoginController {

	
	@Autowired
	LoginService loginService;
	
	@PostMapping(
				path = {"/login"},
				consumes = {MediaType.APPLICATION_JSON_VALUE},
				produces ={MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<?> login(@RequestBody @Valid LoginDto logindto){
		Boolean flag=false;
		flag=loginService.checkLogin(logindto);
		
		if(flag) {
			return ResponseEntity.ok(new Response(true, 200, "Login succesfully", null));
		}
		
		return ResponseEntity.ok(new Response(true, 401, "email or Password Incorrect", null));
	}
}
