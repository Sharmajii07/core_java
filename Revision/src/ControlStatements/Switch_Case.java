package ControlStatements;

import java.util.Scanner;

public class Switch_Case {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int no;
			
			System.out.println("Enter the number");
			no = sc.nextInt();
			
			switch(no) {
			
			
			case 1:
					System.out.println("Input is good");
					break;
					
			case 2:
				System.out.println("Input is better");
					break;
				
			case 3:
				System.out.println("Input is best");
					break;
					
			default : System.out.println("Not in any case");
			}
		
	}

}
