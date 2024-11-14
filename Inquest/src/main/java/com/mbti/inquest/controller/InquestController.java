package com.mbti.inquest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mbti.inquest.model.service.InquestService;

@Controller
public class InquestController {
	
	@Autowired
	private InquestService iService;
	
	@GetMapping("/promise")
	public String promiseMove() {
		return "test";
	}
}
