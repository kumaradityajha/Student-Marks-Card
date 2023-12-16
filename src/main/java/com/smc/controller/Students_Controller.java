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

import com.smc.DTO.Students;
import com.smc.helper.Response_Structure;
import com.smc.service.Student_service;

@Controller

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
	

}
