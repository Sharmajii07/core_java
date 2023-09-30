package ControlStatements;

import java.util.Scanner;

public class Switch_Case_Calculator {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n1,n2,total=0;
			char operator;
			
			
			System.out.println("Enter the first number");
			n1 = sc.nextInt();
			

			System.out.println("Enter the second number");
			n2 = sc.nextInt();
			
			System.out.println("Enter any operator (+, -, *, /, %)");
			operator = sc.next().charAt(0);
			
			switch(operator) {
			

			case '+':
					total=n1+n2;
					System.out.println("The addition of given number is:" +total);
					break;
					

			case '-':
					total=n1-n2;
					System.out.println("The substraction of given number is:" +total);
					break;
					
					

			case '*':
					total=n1*n2;
					System.out.println("The multiplication of given number is:" +total);
					break;
					
					

			case '/':
					total=n1/n2;
					System.out.println("The division of given number is:" +total);
					break;
					
					

			case '%':
					total=n1%n2;
					System.out.println("The modulo of given number is:" +total);
					break;
					
			default :
					System.out.println("Invalid operator");
					
			
			}
		}

}
