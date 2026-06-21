package task1T1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
   @Id
   private int engid;
   private String type;
   private int cc;
   
   public int getEngid() {
	return engid;
   }
   public void setEngid(int engid) {
	this.engid = engid;
   }
   public String getType() {
	return type;
   }
   public void setType(String type) {
	this.type = type;
   }
   public int getCc() {
	return cc;
   }
   public void setCc(int cc) {
	this.cc = cc;
   }
   
}

