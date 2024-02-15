package com.example.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.RoleEntity;

@Repository
public interface RoleDao extends CrudRepository<RoleEntity,String> {

}
