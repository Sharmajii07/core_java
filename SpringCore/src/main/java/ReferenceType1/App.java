package ReferenceType1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("ReferenceType1/config.xml");

		Tourist t = (Tourist) ac.getBean("t1");
		System.out.println(t);
	}

}
