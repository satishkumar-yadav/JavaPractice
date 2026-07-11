package combinedServletHibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int addressid;
	 private int housenumber;
	 private String area;
	 private String city;
	 private int pincode;
	 
	 
	 public int getAddressid() {
		 return addressid;
	 }
//	 public void setAddressid(int addressid) {
//		 this.addressid = addressid;
//	 }
	 public int getHousenumber() {
		 return housenumber;
	 }
	 public void setHousenumber(int housenumber) {
		 this.housenumber = housenumber;
	 }
	 public String getArea() {
		 return area;
	 }
	 public void setArea(String area) {
		 this.area = area;
	 }
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }
	 public int getPincode() {
		 return pincode;
	 }
	 public void setPincode(int pincode) {
		 this.pincode = pincode;
	 }
	 
	 
}
