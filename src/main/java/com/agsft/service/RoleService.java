package com.agsft.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.agsft.domain.Role;
import com.agsft.dto.RoleDto;
import com.agsft.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	ModelMapper modelMapper;

	public List<RoleDto> getRole() {

		List<Role> roles = roleRepository.findAll();
		List<RoleDto> roleList=new ArrayList<>();
		roles.forEach(role->{
			roleList.add(modelMapper.map(role, RoleDto.class));
		});

		return roleList;

	}

}
