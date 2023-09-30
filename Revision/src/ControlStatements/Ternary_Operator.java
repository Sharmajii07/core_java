package ControlStatements;

import java.util.Scanner;

public class Ternary_Operator {
	
		public static void main(String[] args) {
			
			int n1,n2,n3;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter n1");
			n1=sc.nextInt();
			
			System.out.println("Enter n2");
			n2=sc.nextInt();
			
			System.out.println("Enter n3");
			n3=sc.nextInt();
			
			if(n1>n2) {
					if(n1>n3) {
						System.out.println("N1 is bigger");
				} 	else {
						System.out.println("n3 is bigger");
				}
			}else if(n2>n3) {
				System.out.println("n2 is bigger");
			}else {
				System.out.println("n3 is bigger");
			}
			
			
			
			
//			
//			int GreaterNumber = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3); 
//			System.out.println("Greater Number is :" + GreaterNumber );
		}

}
