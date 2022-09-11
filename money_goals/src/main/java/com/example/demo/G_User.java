package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class G_User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String email;
	private String password;
	
	public G_User() {
		
	}
	
	public G_User(G_UserInfo userInfo) {
		this.setEmail(userInfo.getEmail());
		this.setPassword(userInfo.getPassword());
	}
	
	public long getId() {
		return this.id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
