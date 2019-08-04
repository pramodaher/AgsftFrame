package com.agsft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agsft.dto.RoleDto;
import com.agsft.service.RoleService;
import com.agsft.util.Response;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@GetMapping(
			path = {"/role"},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> getRoll(){
		List<RoleDto> roleList=roleService.getRole();
		return ResponseEntity.ok(new Response(true, 200, "Role Record fatch sucessfully",roleList));
		
	}

}
