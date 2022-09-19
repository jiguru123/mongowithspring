package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Builder;

public class User {
	
	private String name;
	
	private int age;
	
	private String date_of_birth;
	
	private String user_name;
	
	private String password;
	
	private UserType userType;
	
	@Field(name = "is_deleted")
	@Builder.Default
	private boolean isActive = false;
	
	@Field(name = "created_on")
	@CreatedDate
	private Date createdOn;

	@Field(name = "updated_on")
	@LastModifiedBy
	private Date updatedOn;
}
