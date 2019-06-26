package com.cy.controller.appeal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cy.service.appeal.AppealService;

@Controller
@RequestMapping("/appeal")
public class AppealController {
	
	@Autowired
	private AppealService AppealService;
	
	@RequestMapping("/index")
	public String index(){
		return "appeal/appeal";
	}
	
}
