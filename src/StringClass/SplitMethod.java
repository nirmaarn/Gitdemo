package StringClass;

public class SplitMethod {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String a1 = "Welcome to Automation";
		String[] j = a1.split("\\s");
		System.out.println(j[1]);
		for(String a :j)
		{
			System.out.println(a);
		}
	}

}
