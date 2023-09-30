package core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();    
    Session session = sf.openSession();
    Transaction tx= session.beginTransaction();
    
//    user u = new user(1, "Amit", 987654321);
//    session.save(u);
    
    user u = session.get(user.class,1);
    System.out.println(u);
    tx.commit();
    session.close();
    sf.close();
   
    
    }
}
