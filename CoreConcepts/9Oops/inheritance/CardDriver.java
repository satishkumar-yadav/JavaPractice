package com.inheritance;

// Example program for Hierarichal inheritance
class Card {
	String name;
	long num;
	String exp;
	String type;
	public void display() {
		System.out.println("Card Name: "+name);
		System.out.println("Card Num: "+num);
		System.out.println("Card Exp: "+exp);
		System.out.println("Card Type: "+type);
		}
}

class CreditCard extends Card {
	int limit;
	public void creditDisplay() {
		display();
		System.out.println("Credit-Limit: "+limit);
		}
}

class DebitCard extends Card {
	int bal;
	public void debitDisplay() {
		display();
		System.out.println("Debit-Balance: "+bal);
		}
}

public class CardDriver {
	public static void main(String[] args) {
		CreditCard c1 = new CreditCard(); 
		c1.name="HDFC Platinum Credit Card";
		c1.num= 937864506;
		c1.exp="12/30";
		c1.type="Master";
		c1.limit=200000;
		//c1.display();
		c1.creditDisplay();
		System.out.println("===============");
		DebitCard d = new DebitCard();
		d.name="SBI Debit Card";
		d.num=87653546;
		d.exp="10/26";
		d.type="Visa";
		d.bal=100;
		d.debitDisplay();
		
		
		

	}

}
