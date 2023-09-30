package CoreJava;

class Sum{
		public int add (int a,int b) {
			int total = a+b;
			return total;
			
		}
}

public class Continue_statement_ {
         //	example of continue statment
		
		public static void main(String[] args) {
			
			int i;
			 for(i=0; i<=10; i++) {
				 if(i%2==0) {
					 continue;
				 }
				 System.out.println(i +" ");
			 }
		
//			 Return Statement example
			 
			 	Sum s = new Sum();
			 	System.out.println(s.add(10, 20));
			 	
			 	
			 	
			 	
	}

}
