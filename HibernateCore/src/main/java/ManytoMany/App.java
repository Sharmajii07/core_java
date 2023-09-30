package ManytoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import OnetoMany.Vehicle;

public class App {
	
public static void main(String[] args){
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Teacher t1 = new Teacher();
		t1.setTid(25);
		t1.setTname("A sir");
		
		Teacher t2 = new Teacher();
		t2.setTid(34);
		t2.setTname("B sir");
		
		Teacher t3 = new Teacher();
		t3.setTid(75);
		t3.setTname("c sir");
		
		List<Teacher> tlist = new ArrayList<Teacher>();
		tlist.add(t1);
		tlist.add(t2);
		tlist.add(t3);
		
		
		Student s1 = new Student();
		s1.setSid(259);
		s1.setSname("umesh");
		
		Student s2 = new Student();
		s2.setSid(952);
		s2.setSname("amit");
		
		Student s3 = new Student();
		s3.setSid(848);
		s3.setSname("vivek");
		
		List<Student> slist = new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		
		
		Course c1 = new Course();
		c1.setCid(18);
		c1.setCname("Java");
		
		Course c2 = new Course();
		c2.setCid(59);
		c2.setCname("Python");
		
		Course c3 = new Course();
		c3.setCid(10);
		c3.setCname("Php");
		
		List<Course> clist = new ArrayList<Course>();
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		
		t1.setCname(clist);
		t2.setCname(clist);
		t3.setCname(clist);
		
		t1.setSname(slist);
		t2.setSname(slist);
		t3.setSname(slist);
		
		c1.setTname(tlist);
		c2.setTname(tlist);
		c3.setTname(tlist);
		
		c1.setSname(slist);
		c2.setSname(slist);
		c3.setSname(slist);
		
		s1.setTname(tlist);
		s2.setTname(tlist);
		s3.setTname(tlist);
		
		s1.setCname(clist);
		s2.setCname(clist);
		s3.setCname(clist);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		
		
		
		
		
		tx.commit();
	    session.close();
	    sf.close();
		
		
		
		
}

}
