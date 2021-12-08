package com.example.domain.user.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class MUser {
	private Integer userId;
	private String password;
	private String userName;
	private String email;
	private Date birthday;
	private Integer age;
	private Integer gender;
	private Integer departmentId;
	private String role;
	private Department department;
	private List<Salary> salaryList;

}
