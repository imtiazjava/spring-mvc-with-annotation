package com.nit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nit.model.Student;
 
 
@Controller
public class StudentController{

	public StudentController() {
		System.out.println("SC object is created.");
				     
	}
	
	@RequestMapping("/")
	public String welcome(Model model) {
		Student student=new Student();
		model.addAttribute("command", student);
		 return "index";
	}
	
	@RequestMapping(value="/store",method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		System.out.println(student);
		return "success";
	}
	
	
	
}
