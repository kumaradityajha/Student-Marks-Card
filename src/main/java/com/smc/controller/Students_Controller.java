package com.smc.controller;

import java.util.List;

import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smc.DTO.Students;
import com.smc.helper.Response_Structure;
import com.smc.service.Student_service;

@RestController
public class Students_Controller
{
	@Autowired
	Student_service student_service;
	
	
	@PostMapping("student")
	@ResponseBody
	public Response_Structure<Students> saveStudent(@RequestBody Students students) 
	{
		Response_Structure<Students> response_Structure = student_service.saveStudents(students);
		
		
		
		return response_Structure;
		
	}
	
	@PostMapping("studentall")
	@ResponseBody
	public Response_Structure<List<Students>> saveMultipleStudent(@RequestBody List<Students> students) 
	{
		return student_service.saveMultipleStudents(students);
		
		
	}
	
	@GetMapping("student/{id}")
	@ResponseBody
	public Response_Structure<Students> fetchById(@PathVariable int id)
	{
		return student_service.fetchById(id);
		
		
		
	}
	
	@GetMapping("student/mobiluu/{mobile}")
	@ResponseBody
	public Response_Structure<List<Students>> fetchByMobile(@PathVariable long mobile)
	{
		Response_Structure<List<Students>> response_Structure = student_service.fetchByMobile(mobile);
		
		return response_Structure;
		
		
		
	}
	
	@GetMapping("student/aboveninty")
	@ResponseBody
	public Response_Structure<List<Students>> marksAboveNinty()
	{
		return student_service.marksAboveNinty();
		
		
	}
	
	@GetMapping("student/NameWithPercentage/{percentage}/{name}")
	public Response_Structure<List<Students>> fetchByNameAndAboveNinty(@PathVariable String name, @PathVariable double percentage) {

		return student_service.fetchByNameAndPercentage(name, percentage);

	}
	
	@GetMapping("getallstudent")
	public Response_Structure<List<Students>> fetchAll() 
	{
	  return student_service.fetchAll();
		
	}

}
