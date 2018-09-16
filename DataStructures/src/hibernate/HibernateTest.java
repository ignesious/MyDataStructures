package hibernate;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails userDetails = new UserDetails();
		Vehicle vehicleDetails1=new Vehicle();
		Vehicle vehicleDetails2=new Vehicle();
		TwoWheeler twoWheelerrun=new TwoWheeler();
		TwoWheeler twoWheelerrun2=new TwoWheeler();
		//Vehicle vehicleDetails2=new Vehicle();
//		Address userAddress=new Address();
//		Address userAddress2=new Address();
//		userAddress.setCity("Madurai");
//		userAddress.setCountry("India");
//		userAddress.setPincode("625001");
//		userAddress.setState("TamilNadu");
//		
//		userAddress2.setCity("Chennai");
//		userAddress2.setCountry("India");
//		userAddress2.setPincode("625001");
//		userAddress2.setState("TamilNadu");
		
		
	/*	for(int i=0;i<10;i++)
		{
			Address loopuserAddress=new Address();
			loopuserAddress.setCity("Chennai " + i);
			loopuserAddress.setCountry("India");
			loopuserAddress.setPincode("625001");
			loopuserAddress.setState("TamilNadu");
			userDetails.getListOfAddress().add(loopuserAddress);
		}*/
		
		
	//	UserDetailss userDetails1 = new UserDetailss();
	//	userDetails.setUserId(1);
		userDetails.setUserName("First User");
		vehicleDetails1.setVehicleName("Bullet");
		vehicleDetails2.setVehicleName("Mopet");
		
//		userDetails.setVehicle(vehicleDetails1);
		userDetails.getVehicleCollection().add(vehicleDetails1);
		userDetails.getVehicleCollection().add(vehicleDetails2);
		vehicleDetails1.setUserdetails(userDetails);
		vehicleDetails2.setUserdetails(userDetails);
		
		
		twoWheelerrun.setUserdetails(userDetails);
		twoWheelerrun.setSteeringHandle("BikeSHit");
		twoWheelerrun.setVehicleName("TwoWheelerYamaha");
		twoWheelerrun2.setUserdetails(userDetails);
		twoWheelerrun2.setSteeringHandle("BikeSHit2");
		twoWheelerrun2.setVehicleName("TwoWheelerYamaha2");
		userDetails.getTwovehicleCollection().add(twoWheelerrun);
		userDetails.getTwovehicleCollection().add(twoWheelerrun2);
		
	//	vehicleDetails2.setVehicleName("Mopet");
	//	userDetails.getVehicle().add(vehicleDetails1);
	//	userDetails.getVehicle().add(vehicleDetails2);
	//	userDetails.setAddress("First Address");
//		userDetails.setJoinedDate(new Date());
//		userDetails.setDescription("Description of user goes here");
//	    userDetails.getListOfAddress().add(userAddress);
	//    userDetails.getListOfAddress().add(userAddress2);
     //   userDetails.setPhonenumber("56");
//        userDetails1.setUserId(6);
//		userDetails1.setUserName("mohammedbismillah");
//        userDetails1.setPhonenumber("56");
        
		
		try {
			/*SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(vehicleDetails1);
			session.save(vehicleDetails2);
			session.save(twoWheelerrun);
			session.save(twoWheelerrun2);
			session.save(userDetails);
			
			
		//	session.save(vehicleDetails2);
		//	session.save(userDetails1);
			session.getTransaction().commit();
			session.close();
			*/
		
			
			
			
			
			
//			// RETREIVAL PART
//			
//			userDetails = null;
//			session=sessionFactory.openSession();
//			session.beginTransaction();
//			
//			userDetails  = (UserDetails)session.get(UserDetails.class, 1);
//			
//			//System.out.println("Retreived in JVM-----> "+ userDetails.getAddress().getCountry());
//			session.close();
//			System.out.println("Collection is--->"+userDetails.getListOfAddress().size());
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
}
}
