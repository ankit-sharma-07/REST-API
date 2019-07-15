package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.college;

@RepositoryRestResource(collectionResourceRel ="colleges",path="colleges" )
public interface collegeRepo extends JpaRepository<college, Integer>{

}
