package first;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
	int id;
    String name;
    double salary;
    long phonenumber;
    String email;
    String gender;
    
	public Employee(int id, String name, double salary, long phonenumber, String email, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phonenumber = phonenumber;
		this.email = email;
		this.gender = gender;
	}
    
    public Employee() {  }

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
    
    
    
}
