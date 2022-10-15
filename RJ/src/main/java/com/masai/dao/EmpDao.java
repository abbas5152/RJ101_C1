package com.masai.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.Employee;


public interface EmpDao extends JpaRepository<Employee,Integer> {

	public Employee findByName(String name);
}
