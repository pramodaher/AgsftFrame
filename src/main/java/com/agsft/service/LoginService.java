package com.agsft.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agsft.domain.Login;
import com.agsft.dto.LoginDto;
import com.agsft.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	LoginRepository loginRepository;

	public boolean checkLogin(LoginDto loginDto) {
		Optional<Login> login=loginRepository.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword());
		if (login.isPresent()) {
			return true;
		}
		return false;
	}
}
