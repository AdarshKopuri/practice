package com.example.roleservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.RoleDao;
import com.example.entity.RoleEntity;

@Service
public class RoleService {

	@Autowired
	private RoleDao roleDao;
	
	public RoleEntity createNewRole(RoleEntity role) {
	return roleDao.save(role);
		
	}
	
	public List<RoleEntity> getRoles() {
		List<RoleEntity> roles = new ArrayList<RoleEntity>();
		roleDao.findAll().forEach(role->roles.add(role));
		return roles;
	}
	
	public RoleEntity getbyid(String id) {
		
		return roleDao.findById(id).get();
	}
	
	
	public void deleteid( String id) {
	 roleDao.deleteById(id);
	
	}
}
