package ExecptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) throws IOException
	{
      FileReader file = new FileReader("D:\\New folder\\a.txt");//if given Java.txt....the existing file then it will show all the data in it
      BufferedReader fileinput = new BufferedReader(file);     
      
      //Print first 3 times of file "C:\_AppUpd"
      
      for (int counter = 0; counter < 3 ; counter ++)
      {
    	  System.out.println(fileinput.readLine());
      }

	}

}
