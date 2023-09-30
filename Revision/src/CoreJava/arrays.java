package CoreJava;

import java.util.Scanner;

//Arrays in java

public class arrays {
	     	public static void main(String[] args) {
	     		
	     		Scanner sc = new Scanner(System.in);
	     		System.out.println("Enter the size of an array....");
	     		int size = sc.nextInt();
	     		int a[] = new int[size];
	     		
	     		for(int i=0; i<a.length; i++) {
	     			System.out.println("enter a:");
	     			a[i] = sc.nextInt();
	     		}
	     		for(int i=0; i<a.length; i++) {
	     			System.out.println(a[i]);
	     		}
	     		
	     		System.out.println("Enter x....");
	     		int X = sc.nextInt();
	     		
	    		for(int i=0; i<a.length; i++) {
	    			if(a[i]==X) {
	    				System.out.println("X found at index..."+i);
	    			}
	    		
	    		}
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
	     		
				
				//Defining an array
				//type[]arrayname = new type[size];
	/**
			int[]marks = new int[5];
			marks[0] = 10;
			marks[1] = 11;
			marks[2] = 12;
			marks[3] = 13;
			marks[4] = 14;
			System.out.println(marks);
			
			for(int i=0; i<5; i++) {
				System.out.println(marks[i]);
			}*/
	     		
//	     		Scanner sc=new Scanner(System.in);
//	     		
//	     		System.out.println("Enter Array size..");
//	     		int Size = sc.nextInt();
}
}