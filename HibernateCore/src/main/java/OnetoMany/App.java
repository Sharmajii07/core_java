package OnetoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args){
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Owner o = new Owner();
		o.setOid(1);
		o.setOname("amit");
		
		Vehicle v1 = new Vehicle();
		v1.setVid(001);
		v1.setVname("Bmw");
		
		Vehicle v2 = new Vehicle();
		v2.setVid(002);
		v2.setVname("audi");
		
		Vehicle v3 = new Vehicle();
		v3.setVid(003);
		v3.setVname("mercedes");
		
		Vehicle v4 = new Vehicle();
		v4.setVid(004);
		v4.setVname("jaguar");
		
		List<Vehicle> vlist = new ArrayList<Vehicle>();
		
		vlist.add(v1);
		vlist.add(v2);
		vlist.add(v3);
		vlist.add(v4);
		
		o.setVehiclename(vlist);
		v1.setOwnername(o);
		v2.setOwnername(o);
		v3.setOwnername(o);
		v4.setOwnername(o);
		
		session.save(o);
		session.save(v1);
	    session.save(v2);
	    session.save(v3);
	    session.save(v4);
	    
		
		tx.commit();
	    session.close();
	    sf.close();
		
		
		
	}

}
