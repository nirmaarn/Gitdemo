package ExecptionHandling;

public class TryCatchExample 
{

	public static void main(String[] args)
	{
		try {
			float a[] = {2,89,69,96};
			float b = a[2]/13f;
			a[2] = 30/4f;
			System.out.println(b + "\n" +a[2]);
		}
           catch(ArithmeticException e) {System.out.println("No. can't be divided by 0");}
           catch(ArrayIndexOutOfBoundsException e) {System.out.println("Invalid array selected");}
           catch(Exception e) {System.out.println("Most specific execption......thats why written at last");}
		
		  finally {System.out.println("\nFinally command is executed");
           }
	}

}
