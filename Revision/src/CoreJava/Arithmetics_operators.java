package CoreJava;

import java.util.Scanner;

public class Arithmetics_operators {
	public static void main(name[] args) {
		
		byte a=100;
		short b=100;
		System.out.println(a+b);
		int c=a*b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int d = sc.nextInt();
		
		System.out.println("Enter the 2nd value");
		int e = sc.nextInt();
		
		float ans = d+e;
		System.out.println("Addition is :" +ans);
		
		//Multiplication
		
		int multiply =  d*e;
		System.out.println("Multiplication is :" +multiply);
		
		// Division
		
		int division =  d/e;
		System.out.println("Division is :" +division);
		
		//modulus
		
		int modulus =  d%e;
		System.out.println("Modulus is :" +modulus);
		
		//Type casting (int to float)
		
		System.out.println("Addition is :" +(float)ans);
		
		//float to int
		
		System.out.println("Addition is :" + (int)ans);
		
		
		
		
		
		
	}

}
