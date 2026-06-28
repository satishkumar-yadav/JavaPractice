//package task1Tm;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Library {
//	  @Id
//	     @GeneratedValue(strategy=GenerationType.IDENTITY) //can auto generate value and will start from 1
//	     private int libid;
//	     private String name;
//	     private long phono;
//	     @OneToMany
//	     private List<Book> booklist;
//	      
//		 public int getLibid() {
//			 return libid;
//		 }
////		 public void setLibid(int libid) {
////			 this.libid = libid;
////		 }
//		 public String getName() {
//			 return name;
//		 }
//		 public void setName(String name) {
//			 this.name = name;
//		 }
//		 public long getPhono() {
//			 return phono;
//		 }
//		 public void setPhono(long phono) {
//			 this.phono = phono;
//		 }
//		 public List<Book> getBooklist() {
//			 return booklist;
//		 }
//		 public void setBooklist(List<Book> booklist) {
//			 this.booklist = booklist;
//		 }
//		 
//		 @Override
//		 public String toString() {
//			return "Library [libid=" + libid + ", name=" + name + ", phono=" + phono + ", booklist=" + booklist + "]";
//		 }
//		 
//		 
//}
