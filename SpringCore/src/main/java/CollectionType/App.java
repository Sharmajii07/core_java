package CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		public static void main(String[] args) {
			
			ApplicationContext ac = new ClassPathXmlApplicationContext("CollectionType/config.xml");
			
			User u = (User)ac.getBean("u1");
			System.out.println(u);
			
		}

}
