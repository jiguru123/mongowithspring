package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Builder;

@Document(collation = "employee")
public class Employee {

	@Id
	private String id;

	@Field(name = "date_of_joining")
	private String dateOfJoining;

	@Field(name = "created_on")
	@CreatedDate
	private Date createdOn;

	@Field(name = "updated_on")
	@LastModifiedBy
	private Date updatedOn;

	@Field(name = "is_deleted")
	@Builder.Default
	private boolean isActive = false;
	
	private User user;
	
	private Department department
}
