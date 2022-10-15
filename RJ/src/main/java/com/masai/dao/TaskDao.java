package com.masai.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.Task;


public interface TaskDao extends JpaRepository<Task,Integer> {

	public Task findByEmpid(Integer id);
}
