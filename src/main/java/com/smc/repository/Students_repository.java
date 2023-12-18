package com.smc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smc.DTO.Students;


public interface Students_repository extends JpaRepository<Students, Integer>
{

	List<Students> findByMobile(long mobile);

	@Query("SELECT s FROM Students s WHERE s.percentage >= 90")
	List<Students> findAboveNinty();
	
	@Query("SELECT s FROM Students s WHERE (s.percentage >= :percentage) AND (s.sname LIKE %:sname% OR :sname IS NULL)")
	List<Students> findByNameAndPercentage(@Param("sname") String sname, @Param("percentage") Double percentage);

	
	
	

}
