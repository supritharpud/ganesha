package com.mccoy.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer implements Serializable{
@Column(name="name")
private String name;
@Column(name="accno")
private int accno;
@Column(name="accbal")
private double accbal;
@Id
@Column(name="userid")
private int userid;
@Column(name="password")
private String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public double getAccbal() {
	return accbal;
}
public void setAccbal(double accbal) {
	this.accbal = accbal;
}
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

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.accno+" "+this.accbal+" "+this.userid+"  "+this.password;
	}
}
