package com.pa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int pid;
	 private String name;
	 private int age;
	 private String gender;
	 // @OneToOne(cascade = CascadeType.ALL)
	 // @JoinColumn(name="aadhaar_id")
	 @OneToOne
	 private Aadhaar aadhaar;
	 
	 public Person(){ }
	 
	 public Person(String name, int age, String gender, Aadhaar aadhaar) {
		 this.name= name;
		 this.age=age;
		 this.gender=gender;
		 this.aadhaar=aadhaar;
	 }
	 
	 public int getPid() {
		 return pid;
	 }
//	 public void setPid(int pid) {
//		 this.pid = pid;
//	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 public String getGender() {
		 return gender;
	 }
	 public void setGender(String gender) {
		 this.gender = gender;
	 }
	 public Aadhaar getAadhaar() {
		 return aadhaar;
	 }
	 public void setAadhaar(Aadhaar aadhaar) {
		 this.aadhaar = aadhaar;
	 }
	 
	 @Override
	 public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", aadhaar=" + aadhaar
				+ "]";
	 }
	 
	 
	 
}
