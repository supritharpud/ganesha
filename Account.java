package com.mccoy.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account implements Serializable {
	@Column(name="userid")
	private int userid;
	@Column(name="password")
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid")
	private Customer cust;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.userid+" "+this.password;
}
}
