package first;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  // for creating sql table with class name as table name
public class Student {
    //all variables treated as column in table
	@Id // specifies below variable as pk
	int stuid;
	String stuname;
	double marks;
	String email;
	
	public Student(int stuid, String stuname, double marks, String email) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.marks = marks;
		this.email = email;
	}
	
	public Student() {
		
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
