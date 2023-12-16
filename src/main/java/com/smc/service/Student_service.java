package com.smc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.smc.DAO.StudentDAO;
import com.smc.DTO.Students;
import com.smc.helper.Response_Structure;


@Service
public class Student_service
{
	
	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	Response_Structure response_Structure;
	
	
	public Response_Structure saveStudents(Students students)
	{
		
		 double percentage = (students.getMath_marks()+students.getScience_marks()+students.getEnglish_marks()+students.getHindi_marks()+students.getSocial_science_marks())/5.0;
		
		 students.setPercentage(percentage);
		 
		 if(percentage>90)
		 {
			 students.setResult("Distinction");
		 }
		 else 
		 {
			 if (percentage>=60 && percentage<90)
			 {
				 students.setResult("1st Class");
				
			}
			 else
			 {
				 students.setResult("Fail");
				
			}
			
		}
		 
		
		//return students;
		 
		 Response_Structure<Students> response_Structure = new Response_Structure<Students>();
		 
		 //Students students2 = studentDAO.saveStudent(students);
		 
		 response_Structure.setMsg("Data Saved Succesfully");
		 response_Structure.setStatus_code(HttpStatus.CREATED.value());
		 response_Structure.setData(studentDAO.saveStudent(students));
		 
		 return response_Structure;
	}
	
	public Response_Structure<List<Students>> saveMultipleStudents(List<Students> student)
	{
		for (Students students : student)
		{

			 double percentage = (students.getMath_marks()+students.getScience_marks()+students.getEnglish_marks()+students.getHindi_marks()+students.getSocial_science_marks())/5.0;
			
			 students.setPercentage(percentage);
			 
			 if(percentage>90)
			 {
				 students.setResult("Distinction");
			 }
			 else 
			 {
				 if (percentage>=60 && percentage<90)
				 {
					 students.setResult("1st Class");
					
				}
				 else
				 {
					 students.setResult("Fail");
					
				}
				 
				 
				  studentDAO.saveStudent(students);
				 
				
			
		}
			 
			 
			
		}
		
		Response_Structure <List<Students>> response_Structure = new Response_Structure();
		response_Structure.setMsg("Data Saved Succesfully");
		 response_Structure.setStatus_code(HttpStatus.CREATED.value());
		 response_Structure.setData(studentDAO.saveMultipleStudent(student));
		 
		 return response_Structure;
		
		
	
	}
	
	public Response_Structure<Students> fetchById(int id)
	{
		
		Students students = studentDAO.fetchById(id);
		
		Response_Structure <Students> response_Structure = new Response_Structure();
		
		if (students==null)
		{
			response_Structure.setMsg("Data Not Found");
			 response_Structure.setStatus_code(HttpStatus.NOT_FOUND.value());
			 response_Structure.setData(null);
				
		}
		else
		{
			response_Structure.setMsg("Data  Found");
			 response_Structure.setStatus_code(HttpStatus.FOUND.value());
			 response_Structure.setData(students);
			
			
		}
		
		return response_Structure;
	}

	public Response_Structure fetchByMobile(long mobile)
	{
		List<Students> list = studentDAO.fetchByMobile(mobile);
		
		Response_Structure <List<Students>> response_Structure = new Response_Structure();
		
		if (list==null)
		{
			response_Structure.setMsg("Data Not Found");
			 response_Structure.setStatus_code(HttpStatus.NOT_FOUND.value());
			 response_Structure.setData(null);
				
		}
		else
		{
			response_Structure.setMsg("Data  Found");
			 response_Structure.setStatus_code(HttpStatus.FOUND.value());
			 response_Structure.setData(list);
			
			
		}
		
		return response_Structure;
	}
}
