package CoreJava;

public class Wrapper_class {
	
		public static void main(String[] args) {
			byte a=10;
			short b=15;
			int c=20;
			long d=2000;
			float e=10.12f;
			double f=20.545145454d;
			char g='A';
			String h="Amit";
			boolean i=true;
		
			
			System.out.println("Hey Umesh Sharma , It's a wrapper class");
			
			byte byobj = new Byte(a);
			System.out.println("byte"+ byobj);
			
			short shobj = new Short(a);
			System.out.println("short"+ shobj);
			
			Integer inobj = new Integer((int)e);
			System.out.println("Integer to float" +inobj);
			
			
			/**byte byobj = new Byte(a);
			System.out.println("byte"+ byobj);
			
			byte byobj = new Byte(a);
			System.out.println("byte"+ byobj);
			
			byte byobj = new Byte(a);
			System.out.println("byte"+ byobj);
			
			byte byobj = new Byte(a);
			System.out.println("byte"+ byobj);
			*/
	}

}
