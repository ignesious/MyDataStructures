package hibernate;
import java.util.Date;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class HibernateTestSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserDetails2 userDetailsobj;
		
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		// userDetailsobj  = (UserDetails2)session.get(UserDetails2.class, 1);
		
		
	/*	//Creation Part
		for(int i= 1 ;i<11;i++)
		{
			userDetailsobj =  new UserDetails2();
		    userDetailsobj.setUserName("User is "+ i);
		    session.save(userDetailsobj);
		    
		}*/
		
		
//		Query part
//		Query<UserDetails2> query=session.getNamedQuery("UserDetails2.byID");
//		query.setInteger("userId",1);
//		List<UserDetails2> resultList=query.list();
		
		
		//Using Criteria API's
		
		
		Criteria criteria=session.createCriteria(UserDetails2.class);
		
		Criterion name = Restrictions.gt("userid", 1);
		Criterion name2 = Restrictions.eq("userid", 1);
		Criterion finalCriterion=Restrictions.or(name, name2);
		criteria.add(finalCriterion);
		List<UserDetails2> resultList=criteria.list();
		
		
		System.out.println(resultList);
		for(UserDetails2 a:resultList)
		{
			System.out.println(a.getUserid() + " ------>"+ a.getUserName());
		}
		
		
		
		
		
		//userDetailsobj.setUserName("Updated by mohammed");
	//	session.save(vehicleDetails2);
	//	session.save(userDetails1);
		session.getTransaction().commit();
		session.close();
		
		//Updation Part now its detached object
		
		
		
		
		
       /* System.out.println("Before persisting the detached object the user id is "+ userDetailsobj.getUserid());
        
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetailsobj);
		session.getTransaction().commit();
		session.close();*/
		
	}

}
