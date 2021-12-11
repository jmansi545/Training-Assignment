package com.example.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserDB")

public class User {
	/*
	 * id name email_id phone_number password role
	 */
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;
	

	@Column(name="name")
	private String name;
	
	@Column(name="emailAddress")
	private String emailAddress;
	
	
	
	@Column(name="phone")
	private int phone;
	
	@Column(name="password")
	private String password ;
	
	
	@Column(name="role")
	private String role;

	
	  @OneToMany(mappedBy = "user")
	 private List<Ticket> ticket;
	 
	public User(Long userid, String name, String emailAddress, int phone, String password, String role) {
		this.userid = userid;
		this.name = name;
		this.emailAddress = emailAddress;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}


	public Long getUserid() {
		return userid;
	}


	


	

	public void setUserid(Long userid) {
		this.userid = userid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	



}
