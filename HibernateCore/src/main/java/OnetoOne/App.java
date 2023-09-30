	package OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
		public static void main(String[] args) {
			
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			
			Student s1 = new Student();
			
			s1.setSid(1);
			s1.setName("amit");
			s1.setSroll(001);
			
			Student s2 = new Student();
			
			s2.setSid(2);
			s2.setName("umesh");
			s2.setSroll(002);
			
			Teacher t1 = new Teacher();
			
			t1.setTid(1);
			t1.setTname("Java Sir");
			
			Teacher t2 = new Teacher();
			
			t2.setTid(2);
			t2.setTname("Python Sir");
			
			s1.setTeachername(t2);
			s2.setTeachername(t1);
			
//			session.save(s1);
			session.save(s2);
//			session.save(t1);
//			session.save(t2);
			
			
			tx.commit();
			session.close();
			sf.close();
		}

}
