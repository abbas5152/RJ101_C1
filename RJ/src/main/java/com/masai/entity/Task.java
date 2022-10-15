package com.masai.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taskid;


	@NotNull(message = "title name can not be Null.Please Add Proper title")
	private String title;
	
	@NotNull(message = "Description can not be Null.Please Add Proper description")
	private String  description;
	
	@NotNull(message = "status  can not be Null.Please Add true or false")
	private Boolean  status;
	
	@NotNull(message = "priority  can not be Null.Please Add high,medium or low")
	private String priority ;
	
	@NotNull(message = "status  can not be Null.Please Add valid date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate deadline;
	
	@NotNull(message = "empid  can not be Null.Please Add id of employee")
   private Integer empid ;


public Integer getTaskid() {
	return taskid;
}


public void setTaskid(Integer taskid) {
	this.taskid = taskid;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public Boolean getStatus() {
	return status;
}


public void setStatus(Boolean status) {
	this.status = status;
}


public String getPriority() {
	return priority;
}


public void setPriority(String priority) {
	this.priority = priority;
}


public LocalDate getDeadline() {
	return deadline;
}


public void setDeadline(LocalDate deadline) {
	this.deadline = deadline;
}


public Integer getEmpid() {
	return empid;
}


public void setEmpid(Integer empid) {
	this.empid = empid;
}


public Task(Integer taskid, String title, String description, Boolean status, String priority, LocalDate deadline,
		Integer empid) {
	super();
	this.taskid = taskid;
	this.title = title;
	this.description = description;
	this.status = status;
	this.priority = priority;
	this.deadline = deadline;
	this.empid = empid;
}


public Task() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Task [taskid=" + taskid + ", title=" + title + ", description=" + description + ", status=" + status
			+ ", priority=" + priority + ", deadline=" + deadline + ", empid=" + empid + "]";
}

	
	
}
