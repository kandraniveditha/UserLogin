package com.suchiit.model;



import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="user")
public class User {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private long mobileNumber;
	private String password;
	
	@CreatedDate
	private Date createdAt;
	@LastModifiedDate
	private Date updatedAt;
	private String status;
}
