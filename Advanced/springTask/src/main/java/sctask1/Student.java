package sctask1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	//direct initialisation 
  
	 @Value("12")
	  private byte id;
	 @Value("320")
	  private short batch;
	 @Value("86542")
	  private int scid;
	 @Value("6428549123L")
	  private long phone;
	 @Value("97.0")
	  private float marks;
	 @Value("J")
	  private char firstLetter;
	 @Value("true")
	  private boolean isTopper;
	 @Value("Jerry")
	  private String name;	
	
//  private byte id;
//  private short batch;
//  private int scid;
//  private long phone;
//  private float marks;
//  private char firstLetter;
//  private boolean isTopper;
//  private String name;
 
  
  //using constructor
//public Student(@Value("14") int id, @Value("xyz") String name,@Value("86.8") double marks) {
//	this.id = id;
//	this.name = name;
//	this.marks = marks;
//}

  
  //using setter
  
//  public void setId(byte id) {
//	this.id = id;
//  }
//  public void setBatch(short batch) {
//	this.batch = batch;
//  }
//  public void setScid(int scid) {
//	this.scid = scid;
//  }
//  public void setPhone(long phone) {
//	this.phone = phone;
//  }
//  public void setMarks(float marks) {
//	this.marks = marks;
//  }
//  public void setFirstLetter(char firstLetter) {
//	this.firstLetter = firstLetter;
//  }
//  public void setTopper(boolean isTopper) {
//	this.isTopper = isTopper;
//  }
//  public void setName(String name) {
//	this.name = name;
//  }

  
  @Override
  public String toString() {
	return "Student [id=" + id + ", batch=" + batch + ", scid=" + scid + ", phone=" + phone + ", marks=" + marks
			+ ", firstLetter=" + firstLetter + ", isTopper=" + isTopper + ", name=" + name + "]";
  }
 
  
  

 
  
}
