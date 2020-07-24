package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {

	
	@RequestMapping("/test")
	public String listContact() {
		
		System.out.println("Test JSP diplayed");
		return "test.jsp";
	}


}
