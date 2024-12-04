package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.MyConfiguration;



@RestController
public class MyController {
	@Autowired
	MyConfiguration config;
	
	
	@GetMapping
	public String getData() {
		return "Hello from :"+config.getName()+" Call me at: "+config.getPhoneno();
	}
	
	
}