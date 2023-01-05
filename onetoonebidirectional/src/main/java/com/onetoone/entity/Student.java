package com.onetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String age;
	 @OneToOne(cascade = CascadeType.MERGE)
	 @JoinColumn(name="laptop_id")
	private Laptop laptops;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String age, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.laptops = laptop;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Laptop getLaptops() {
		return laptops;
	}

	public void setLaptop(Laptop laptops) {
		this.laptops = laptops;
	}

}
