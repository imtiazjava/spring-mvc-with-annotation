package com.nit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nit.model.Student;

@Controller
public class StudentController{

	public StudentController() {
		System.out.println("SC object is created.");
	}
	
	@RequestMapping(value = "/store",method = RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("inside the add method");
		 int sid=Integer.parseInt(request.getParameter("sid"));
		 String sname=request.getParameter("sname");
		 int smarks=Integer.parseInt(request.getParameter("smarks"));
		 
		 //create student object
		 Student student=new Student();
		 student.setSid(sid);
		 student.setSname(sname);
		 student.setSmarks(smarks);
		 System.out.println(sid+","+sname+","+smarks);
		 ModelAndView mv=new ModelAndView("success");
		 mv.addObject("student",student);
		
		 
		 return mv;
	}
	
	
}
