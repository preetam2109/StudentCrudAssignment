package com.preetamlahre.studentCrud.bean;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private String id;
	private String name;
	private Integer age;
	private String gender;
	private String email;
	
	
	
	public Student() {
		
	}
	public Student(String id, String name, Integer age,String gender,String email) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
		this.gender=gender;
		this.email=email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
