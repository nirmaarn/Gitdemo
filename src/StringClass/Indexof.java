package StringClass;

public class Indexof {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String a1 = "Welcome to Automation";
		System.out.println(a1.indexOf("Automa"));
		//It gives the position of the substring ....eg:for Automation A's index is 11 so the output is shown as 11
		
		String s1 = "Welcome to Automation";
		System.out.println(s1.indexOf("o", 5));
	    //Over her it gives the output as 9 because it will ignore the index till 5th index and after that it will consider 
		//the index of letter where it is present i.e; 9
			

	}

}
