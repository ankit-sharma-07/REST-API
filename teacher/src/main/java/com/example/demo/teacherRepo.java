package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.teacher;

@RepositoryRestResource(collectionResourceRel ="teachers",path="teachers" )
public interface teacherRepo extends JpaRepository<teacher, Integer> {

}
