package Loops;

import java.util.Scanner;

public class Ifelse_Ifelse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         Scanner input = new Scanner (System.in);
         System.out.println("Please give your input");
         int marks = input.nextInt();
         
         if(marks < 50)
         {
        	 System.out.println("Fail");
         }
         else if (marks >=50 && marks < 60)
         {
        	 System.out.println("D grade");
         }
         else if (marks >=60 && marks < 70)
         {
        	 System.out.println("C grade");
         }
         else if (marks >=70 && marks < 80)
         {
        	 System.out.println("B grade");
         }
         else 
         {
        	 System.out.println("Chutiya land");
         }
	}

}
