package com.smc.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smc.DTO.Students;
import com.smc.repository.Students_repository;

@Component
public class StudentDAO
{
	@Autowired
	Students_repository students_repository;
	
	
	public Students saveStudent(Students students)
	{
	   return  students_repository.save(students);
		
		
	}


	public List<Students> saveMultipleStudent(List<Students> student) 
	{
		
		return students_repository.saveAll(student);
	}
	
	public Students fetchById(int id)
	{
	  Optional<Students> optional = students_repository.findById(id);
	  
	  if (optional.isEmpty())
	  {
		  return null;
	  }
	  else 
	  {
		  Students students =  optional.get();
		  
		  return students;
		  
		
	}
		
	}


	public List<Students> fetchByMobile(long mobile)
	{
		 List<Students> list = students_repository.findByMobile(mobile);
		 
		 if (list.isEmpty())
		 {
			 return null;
			
		}
		 else 
		 {
			 return list;
			
		}
		
	}
	

}
