package ControlStatements;
import java.util.Scanner;

public class If_else_Ladder {

       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
           int n;
       
           System.out.println("enter subjects n.");
           n = sc.nextInt();
           int sub[] = new int[n];
           
           int sum  = 0;
           
           String []subList = new String[n];
           int []marks = new int[n];
           for(int i = 0; i<n ; i++) {
        	   System.out.print("enter subject name :");
        	   subList[i] = sc.next(); 
        	   
        	   System.out.println("enter mark of " + subList[i]);
        	   marks[i] = sc.nextInt();
        	   
        	   sum += marks[i];
        	   
        	   if(marks[i] > 100) {
        		   System.out.println("please enter marks from 100");
        		   break;
        	   }
           
	}
           System.out.println("Total Marks :" + sum);
           float percentage = (float)sum/n;
           System.out.println("percentage :" + percentage );
        
        if (percentage >= 90) {
        	System.out.println("Student got A grade");
        	
        }
        
        else if (percentage >= 80) {
        	System.out.println("Student got B grade");
        } 
        
        else if (percentage >= 70) {
        	System.out.println("Student got C grade");
        } 

		else if (percentage >= 60) {
        	System.out.println("Student got D grade");
        }
		
		else {
        	System.out.println("Student got Fail");
        }

        
       
        
    }
}