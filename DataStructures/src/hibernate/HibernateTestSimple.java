package hibernate;
import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserDetails2 userDetailsobj;
		
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		 userDetailsobj  = (UserDetails2)session.get(UserDetails2.class, 1);
		//userDetailsobj.setUserName("Updated by mohammed");
	//	session.save(vehicleDetails2);
	//	session.save(userDetails1);
		session.getTransaction().commit();
		session.close();
		
		//Updation Part now its detached object
		userDetailsobj.setUserName("Updated Username");
        System.out.println("Before persisting the detached object the user id is "+ userDetailsobj.getUserid());
        
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetailsobj);
		session.getTransaction().commit();
		session.close();
		
	}

}
