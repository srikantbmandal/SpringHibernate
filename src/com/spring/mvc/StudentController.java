package com.spring.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{fileCountryOptions}")
	private Map<String,String> fileCountryOptions;
	
	// create a method to show form
	@RequestMapping("/showRegistrationForm")
	public String showForm(Model theModel) {
		// create a student object
		Student theStudent = new Student();

		// add student object to model
		theModel.addAttribute("student", theStudent);

		theModel.addAttribute("fileCountryOptions",fileCountryOptions);
		
		// return student form
		return "student-form";
	}

	// create method to return show welcome page
	@RequestMapping("/processRegistrationForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("Student's First Name: " + theStudent.getFirstName());
		return "student-confirmation";
	}
}
