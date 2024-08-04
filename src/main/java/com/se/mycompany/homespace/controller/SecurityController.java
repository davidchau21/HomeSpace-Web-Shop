package com.se.mycompany.homespace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/client")
public class SecurityController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
        @GetMapping("/security")
	public String getSecurity() {
                return "security";
	}

}
