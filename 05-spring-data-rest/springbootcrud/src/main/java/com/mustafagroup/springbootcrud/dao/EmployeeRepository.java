package com.mustafagroup.springbootcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mustafagroup.springbootcrud.entity.Employee;

@RepositoryRestResource(path="members")				// http://localhost:8080/asworker/members/3
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {  

}
