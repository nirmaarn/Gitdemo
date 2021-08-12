package Abstraction;

public class MultipleInheritanceClass implements MultipleInheritance1,MultipleInheritance2
{
   public void check1()
   {
	   MultipleInheritance1.super.check1();
	   MultipleInheritance2.super.check1();
   }
	public static void main(String[] args)
	{
		MultipleInheritanceClass m1 = new MultipleInheritanceClass();
		m1.check1();
	}

}
