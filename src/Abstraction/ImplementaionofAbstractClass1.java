package Abstraction;

public class ImplementaionofAbstractClass1 extends AbstractClass1
{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
		System.out.println("This is method 2");
		
	}
	
	public static void main(String args[])
	{
      //  AbstractClass1 = new AbstractClass1():Error
		AbstractClass1 ab =new ImplementaionofAbstractClass1();
		ab.method2();
		ab.method1();
	}


}
