package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Admin;
import com.cg.services.AdminService;



@RestController
@RequestMapping("/edu/admin")
public class AdminController {
	// Initializing Logger
	
	// autowiring AdminService service interfaces
	@Autowired
	private AdminService adminService;

	@GetMapping("/login")
	public ResponseEntity<Admin> adminLogin(@RequestBody Admin admin) {

		String username = admin.getUserName();
		String password = admin.getPassword();

		Admin a = adminService.adminLogin(username, password);

		if (a == null) {
			return new ResponseEntity("Sorry login failed !", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Admin>(a, HttpStatus.OK);
	}

}
