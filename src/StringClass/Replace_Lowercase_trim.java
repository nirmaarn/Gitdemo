package StringClass;

public class Replace_Lowercase_trim {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a1 = " Welcome to Automation ";
		System.out.println(a1.replace("Automation", "Selenium"));
		System.out.println(a1.toLowerCase());
		System.out.println(a1.toUpperCase());
		System.out.println(a1.trim());
		String[] j = a1.split("\\s");
		System.out.println(j[1]);
		for(String a :j)
		{
			System.out.println(a.toLowerCase());
		}
	}

}
//Homework: Count the words, Reverse the string, Reverse the word