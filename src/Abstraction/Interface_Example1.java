package Abstraction;

public class Interface_Example1 implements Interface_Example 
{

	@Override
	public void method1()
	{
		System.out.println("Test1 method");
		
	}

	@Override
	public void method2() 
	{
		System.out.println("Test 2 method");
		
	}
	public static void main (String args[])
	{
		Interface_Example i = new Interface_Example1();
		//a=20; //Error because value of final variable can not be changed
		System.out.println(Interface_Example.a);
		i.method1();
		i.method2();
		Interface_Example.method4();
	}

}
