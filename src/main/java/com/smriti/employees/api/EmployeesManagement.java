package com.smriti.employees.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesManagement {
	
	@RequestMapping("/health")
    public String healthCheck(){
		
		String ok = "OK";
		return ok;
	}

}
