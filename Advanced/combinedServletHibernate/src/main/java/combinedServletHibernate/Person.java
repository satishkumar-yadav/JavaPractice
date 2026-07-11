package combinedServletHibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int personid;
	private String personname;
	private long phone;
	private String email;
	//has a
	@OneToOne
	private Address address;
	
	
	public int getPersonid() {
		return personid;
	}
//	public void setPersonid(int personid) {
//		this.personid = personid;
//	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}

