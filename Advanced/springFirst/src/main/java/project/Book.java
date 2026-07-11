package project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
public class Book {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int bid;
  private String title;
  private String author;
  private double price;
  
  public int getBid() {
	return bid;
}

  //  public void setBid(int bid) {
//	this.bid = bid;
//  }
  public String getTitle() {
	return title;
  }
  public void setTitle(String title) {
	this.title = title;
  }
  public String getAuthor() {
	return author;
  }
  public void setAuthor(String author) {
	this.author = author;
  }
  public double getPrice() {
	return price;
  }
  public void setPrice(double price) {
	this.price = price;
  }
  
  @Override
  public String toString() {
  	return "Book [bid=" + bid + ", title=" + title + ", author=" + author + ", price=" + price + "]";
  }
  
  
}
