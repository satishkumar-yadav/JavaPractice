//package task1T1;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import mapping1T1.Car;
//import mapping1T1.Engine;
//
//public class Fetch {
//
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//		
//		//find engine
//		Engine e1 = em.find(Engine.class, 1);
//		if(e1!=null)
//			System.out.println(e1.getCc()+" "+e1.getType());
//		else 
//			System.out.println("Invalid engine id");
//		System.out.println("----------------");
//		
//		//find car
//		Car c1 = em.find(Car.class, 101);
//		if(c1!=null) {
//			System.out.println(c1.getBrand()+" "+c1.getCost());
//			Engine e = c1.getEng();
//			if(e!=null) System.out.println(e.getCc()+" "+e.getType());
//		}
//		else 
//			System.out.println("Invalid Car id");	
//
//	}
//
//}
