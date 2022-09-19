package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Builder;

public class Department {

	private String dept_name;
	
	@Field(name = "created_on")
	@CreatedDate
	private Date createdOn;

	@Field(name = "updated_on")
	@LastModifiedBy
	private Date updatedOn;
	
	@Field(name = "is_deleted")
	@Builder.Default
	private boolean isActive = false;
}
