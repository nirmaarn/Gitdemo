package StaticVariable;

public class StaticBlockExample
{
static int a =10;
static int b;

   static {
	   System.out.println("Static block initialized: ");

	   b = a*5;
   }
	public static void main(String[] args)
	{
 System.out.println("Value of a "+ a);
 System.out.println("Final amount is "+b);

	}

}
