package autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("autowireAnnotation/config.xml");

		User u = (User) ac.getBean("u1");
		System.out.println(u);
	}

}
