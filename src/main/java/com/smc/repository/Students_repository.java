package com.smc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smc.DTO.Students;


public interface Students_repository extends JpaRepository<Students, Integer>
{

	List<Students> findByMobile(long mobile);
	
	

}
