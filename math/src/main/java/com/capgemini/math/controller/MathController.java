package com.capgemini.math.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

	@PostMapping("/add")
	public int addition(int a,int b) {
		return a+b;
	}
}
