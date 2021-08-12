package Polymorphism;

public class MethodOverloadingExample
{
     public int sum(int x, int y)
     {
    	 return (x + y);
     }
     public int sum(int x, int y, int z)
     {
    	 return(x + y + z);
     }
     public double sum(double x, double y)
     {
    	 return (x + y);
     }
	public static void main(String[] args) 
	{
	 MethodOverloadingExample s = new MethodOverloadingExample();
	 System.out.println(s.sum(10, 31));
	 System.out.println(s.sum(14, 15, 10));
	 System.out.println(s.sum(1.5, 6.1));

	}

}
