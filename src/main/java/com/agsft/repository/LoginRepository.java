package com.agsft.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.agsft.domain.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{
	
	@Query(nativeQuery = true,
			value = "SELECT " + 
					" * "+
					"FROM " + 
					"    test.login " + 
					"WHERE " + 
					"    test.login.email = :email " + 
					"    AND "+
					" 	 test.login.password = :password ")
	Optional<Login> findByEmailAndPassword(@Param(value = "email")String email,@Param(value = "password") String password);

}
