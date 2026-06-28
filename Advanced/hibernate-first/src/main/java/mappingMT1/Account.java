//package mappingMT1;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Account {
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private int aid;
//     private String aname;
//     private double balance;
//     //has-a
//     @ManyToOne
//     private Bank bank;
//     
//     
//	 public int getAid() {
//		 return aid;
//	 }
////	 public void setAid(int aid) {
////		 this.aid = aid;
////	 }
//	 public String getAname() {
//		 return aname;
//	 }
//	 public void setAname(String aname) {
//		 this.aname = aname;
//	 }
//	 public double getBalance() {
//		 return balance;
//	 }
//	 public void setBalance(double balance) {
//		 this.balance = balance;
//	 }
//	 public Bank getBank() {
//		 return bank;
//	 }
//	 public void setBank(Bank bank) {
//		 this.bank = bank;
//	 }
//	 
//	 
//	 @Override
//	 public String toString() {
//		return "Account [aid=" + aid + ", aname=" + aname + ", balance=" + balance + ", bank=" + bank + "]";
//	 }
//	 
//}
