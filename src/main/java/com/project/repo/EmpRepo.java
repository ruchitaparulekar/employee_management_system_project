package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer>{

}
