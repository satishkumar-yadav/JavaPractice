package mappingMtM;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int sid;
   private String sname;
   private long phono;
   //has-a
   @ManyToMany
   private List<Course> courseList;
   
   
   public int getSid() {
	return sid;
   }
//   public void setSid(int sid) {
//	this.sid = sid;
//   }
   public String getSname() {
	return sname;
   }
   public void setSname(String sname) {
	this.sname = sname;
   }
   public long getPhono() {
	return phono;
   }
   public void setPhono(long phono) {
	this.phono = phono;
   }
   public List<Course> getCourseList() {
	return courseList;
   }
   public void setCourseList(List<Course> courseList) {
	this.courseList = courseList;
   }
   
   
   @Override
   public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", phono=" + phono + ", courseList=" + courseList + "]";
   }
   
   
}
