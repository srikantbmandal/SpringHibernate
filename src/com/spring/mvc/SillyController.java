package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/silly")
public class SillyController {

	
	// create a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showFormSilly() {
		return "silly";
	}

//	// create a controller to process the html form
//	@RequestMapping("/processForm")
//	public String processForm1() {
//		return "helloworld";
//	}
	
	
	// create controller to read form data and add data to the model
	@RequestMapping("/processFormVersionThree")
	public String processForm3(@RequestParam("studentName") String theName, Model model) {
		String capitalStudentName = "Yup! " + theName.toUpperCase();
		model.addAttribute("message", capitalStudentName);
		return "helloworld";
	}
}
