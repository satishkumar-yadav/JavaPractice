package mappingMtM;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int cid;
   private String name;
   private int duration;
   
   
   public int getCid() {
	return cid;
   }
//   public void setCid(int cid) {
//	this.cid = cid;
//   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getDuration() {
	return duration;
   }
   public void setDuration(int duration) {
	this.duration = duration;
   }
   
   @Override
   public String toString() {
	return "Course [cid=" + cid + ", name=" + name + ", duration=" + duration + "]";
   }
   
   
}
