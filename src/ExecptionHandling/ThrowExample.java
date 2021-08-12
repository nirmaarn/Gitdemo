package ExecptionHandling;

public class ThrowExample
{
    static void ChckEligibility(int age, int weight) 
    {
    	if(age>18 && weight>50)
    	{
    		System.out.println("Student is eligible");
    	}
    	else
    	{
    		throw  new ArithmeticException("Kuch to bhasad hai");
    		
    	}
    	
    }
	public static void main(String[] args) 
	{
		ChckEligibility(21,60);
	

	}

}
