package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.dao.EmpDao;
import com.masai.dao.TaskDao;
import com.masai.entity.Employee;
import com.masai.entity.Task;
import com.masai.exception.EmployeeException;

@RequestMapping("/start")
@RestController
public class mycontroller {
	
	@Autowired
	private EmpDao empp;
	
	@Autowired
	private TaskDao taskk;
	
	@PostMapping("/emp")
	public ResponseEntity<Employee> NewEmpHandler(@RequestBody Employee emp) throws EmployeeException{
		
		 
		return new ResponseEntity<Employee>(empp.save(emp),HttpStatus.OK) ;
	}
	
	@PostMapping("/task")
	public ResponseEntity<Task> NewTaskHandler(@RequestBody Task task) throws EmployeeException{
		
		
		return new ResponseEntity<Task>(taskk.save(task),HttpStatus.OK) ;
	}
	
	@PutMapping("/task")
	public ResponseEntity<Task> NewTaskUpdateHandler(@RequestBody Task task) throws EmployeeException{
		
		
		return new ResponseEntity<Task>(taskk.save(task),HttpStatus.OK) ;
	}
	
	@GetMapping("/emp/{Id}")
	public ResponseEntity<Employee> getEmployeebyIdHandler(@PathVariable("Id") Integer Id ) throws EmployeeException {
		
		Employee em=empp.findById(Id).get();
		if(em==null)
			 throw new EmployeeException("Not Found");
		else
		return new ResponseEntity<Employee>(em,HttpStatus.OK) ;
	}
	
	@GetMapping("/empbyName/{Id}")
	public ResponseEntity<Employee> getEmployeebyNameHandler(@PathVariable("Id") String Id ) throws EmployeeException {
		
		Employee em=empp.findByName(Id);
		if(em==null)
			 throw new EmployeeException("Not Found");
		else
		return new ResponseEntity<Employee>(em,HttpStatus.OK) ;
	}
	
	@GetMapping("/taskbyemp/{Id}")
	public ResponseEntity<Task> getTaskbyEmpIdIdHandler(@PathVariable("Id") Integer Id ) throws EmployeeException {
		
	Task t=taskk.findByEmpid(Id);
		if(t==null)
			 throw new EmployeeException("Not Found");
		else
		return new ResponseEntity<Task>(t,HttpStatus.OK) ;
	}
//	
//	@GetMapping("/taskbytitle/{Id}")
//	public ResponseEntity<Task> getTaskbyStringIdHandler(@PathVariable("Id") String Id ) throws EmployeeException {
//		
//	Task t=taskk.findByTitle(Id);
//		if(t==null)
//			 throw new EmployeeException("Not Found");
//		else
//		return new ResponseEntity<Task>(t,HttpStatus.OK) ;
//	}
	
	@DeleteMapping("/emp/{Id}")
	public ResponseEntity<Employee> DeleteEmployeebyIdHandler(@PathVariable("Id") Integer Id ) throws EmployeeException {
	
		Employee em=empp.findById(Id).get();
		if(em==null)
			 throw new EmployeeException("Not Found");
		else
			empp.delete(em);
		return new ResponseEntity<Employee>(em,HttpStatus.OK) ;
	}
	
	@DeleteMapping("/task/{Id}")
	public ResponseEntity<Task> DeleteTaskbyIdHandler(@PathVariable("Id") Integer Id ) throws EmployeeException {
	
		Task t=taskk.findById(Id).get();
		if(t==null)
			 throw new EmployeeException("Not Found");
		else
			taskk.delete(t);
		return new ResponseEntity<Task>(t,HttpStatus.OK) ;
	}
	
	


}
