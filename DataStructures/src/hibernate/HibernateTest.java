package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails userDetails = new UserDetails();
		UserDetails userDetails1 = new UserDetails();
		userDetails.setUserId(1);
		userDetails.setUserName("mohammedbismillah");
        userDetails.setPhonenumber("56");
        userDetails1.setUserId(2);
		userDetails1.setUserName("mohammedbismillah");
        userDetails1.setPhonenumber("56");
		try {
			SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(userDetails);
			session.save(userDetails1);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
