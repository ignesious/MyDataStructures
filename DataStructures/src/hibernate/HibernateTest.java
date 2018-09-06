package hibernate;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails userDetails = new UserDetails();
		Address userAddress=new Address();
		userAddress.setCity("Madurai");
		userAddress.setCountry("India");
		userAddress.setPincode("625001");
		userAddress.setState("TamilNadu");
	//	UserDetailss userDetails1 = new UserDetailss();
		userDetails.setUserId(1);
		userDetails.setUserName("First User");
	//	userDetails.setAddress("First Address");
		userDetails.setJoinedDate(new Date());
		userDetails.setDescription("Description of user goes here");
		userDetails.setAddress(userAddress);
     //   userDetails.setPhonenumber("56");
//        userDetails1.setUserId(6);
//		userDetails1.setUserName("mohammedbismillah");
//        userDetails1.setPhonenumber("56");
        
		try {
			SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(userDetails);
		//	session.save(userDetails1);
			session.getTransaction().commit();
			session.close();
			
		
			
			
			
			
			
	/*		// RETREIVAL PART
			
			userDetails = null;
			session=sessionFactory.openSession();
			session.beginTransaction();
			
			userDetails  = (UserDetails)session.get(UserDetails.class, 1);
			
			System.out.println("Retreived in JVM-----> "+ userDetails.getAddress().getCountry());
			session.close();*/
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
}
}
