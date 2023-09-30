package oneToOne1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
		public static void main(String[] args) {
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			
			Flat f1 = new Flat();
			
			f1.setFid(1);
			f1.setFname("Madhuli Flat");
			
			Flat f2 = new Flat();
			
			f2.setFid(2);
			f2.setFname("Manthan Flat");
			
			Builder b1 = new Builder();
			
			b1.setBid(1);
			b1.setBname("Amit");
			
			Builder b2 = new Builder();
			
			b2.setBid(2);
			b2.setBname("Umesh");
			
			f1.setBuildername(b2);
			f2.setBuildername(b1);
			
			b1.setFlatname(f2);
			b2.setFlatname(f1);
			
		    session.save(f1);
		    session.save(f2);
		    session.save(b1);
		    session.save(b2);
		    
		    tx.commit();
		    session.close();
		    sf.close();
			
			
			}

}
