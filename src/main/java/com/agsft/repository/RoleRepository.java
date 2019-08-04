package com.agsft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agsft.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	

}
