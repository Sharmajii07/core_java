package ControlStatements;

import java.util.Scanner;

public class If_Else {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number");
			int no = sc.nextInt();
			
			if(no%2==0) {
				System.out.println(no +" : Number is Even");
			}
			else {
				System.out.println(no +" : Number is Odd");
			}
		}

}
