package com.example.demo.entity;

import lombok.Data;

@Data
public class User {
	
	private int id;
	private String username;
	private String password;
	private String msg;
	private String user_img;
	private int delete_flg;
	private String login_time;
	private String created_date;

	  
}
