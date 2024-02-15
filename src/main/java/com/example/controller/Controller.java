package com.example.controller;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.RoleEntity;
import com.example.roleservice.RoleService;

@CrossOrigin(origins = "http://localhost:4200/register")
//@CrossOrigin("*")


@RestController

//@RequestMapping("/api")
public class Controller {
	@GetMapping("/Home")
	public String home() {
		return "hi ";
		
	}
	
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping({"/createNewRole"})
	public RoleEntity createNewRole(@RequestBody RoleEntity role) {
		roleService.createNewRole(role);
		return role;
		
	}
	
	@GetMapping("/getrole")
	public List<RoleEntity> getRoles() {
		
		return roleService.getRoles();
	}

	@GetMapping("/getrole/{id}")
	public RoleEntity getbyid(@PathVariable("id") String id) {
		
		return roleService.getbyid(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteid(@PathVariable("id") String id) {
		 roleService.deleteid(id);
		 return "deleted";
	}

}
