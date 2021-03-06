package com.cg.MVC.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;


import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
@NotEmpty(message="First Nmae cannot be blank")	
@Pattern(regexp="[A-Z][a-z]{4,}",message="Name should contain only alphabets")	
	private String firstName;
@NotEmpty(message="last Nmae cannot be blank")	
@Pattern(regexp="[A-Z][a-z]{4,}",message="Name should contain only alphabets")
	private String lastName;
@Min(value=20,message="age should be greater than 20")
@Max(value=50,message="age should be less than 50")
	private int age;
@NotEmpty(message="Mobile no. should not be empty")
@Pattern(regexp="[0-9]{10}",message="less than 10 digits")

	private String mobno;
	private String password;
	private String city;

	public Customer(int customerId, String firstName, String lastName, int age, String mobno, String password,
			String city) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mobno = mobno;
		this.password = password;
		this.city = city;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer(String firstName, String lastName, int age, String mobno, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mobno = mobno;
		this.city = city;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", mobno=" + mobno
				+ ", password=" + password + ", city=" + city + "]";
	}
	
}
