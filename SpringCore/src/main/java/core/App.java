package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("core/config.xml");
    	User u1 = (User)ac.getBean("u1");
    	User u2 = (User)ac.getBean("u2");
    	
    System.out.println(u1);
    System.out.println(u2);
    }
}
