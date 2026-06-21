package task1Tm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shop {
     @Id
     private int id;
     private String name;
     private String address;
     @OneToMany
     private Product prod;
     
     
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
	 public String getAddress() {
		 return address;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 public Product getProd() {
		 return prod;
	 }
	 public void setProd(Product prod) {
		 this.prod = prod;
	 }
     
     
     
}
