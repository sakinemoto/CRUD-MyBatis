package com.example.form;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {
    private String userId;
    private String password;
    private String userName;
    
    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private Date birthdayDate;
    
    
    private Integer ageInteger;
    private Integer gender;
}
