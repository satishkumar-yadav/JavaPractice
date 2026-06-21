package combinedTask;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
	int personid;
	String personname;
	long phono;
	String email;
	
	public Person(int personid, String personname, long phono, String email) {
		super();
		this.personid = personid;
		this.personname = personname;
		this.phono = phono;
		this.email = email;
	}
	
	public Person() {    }

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public long getPhono() {
		return phono;
	}

	public void setPhono(long phono) {
		this.phono = phono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
