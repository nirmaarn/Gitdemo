package Practice;

public interface Abstractpractice 
{
	int rollno= 45;
	String s = "Arnold";
	void method2();
default void method1()
{
	System.out.println(rollno + " " + s);
}


}
