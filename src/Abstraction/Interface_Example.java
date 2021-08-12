package Abstraction;

public interface Interface_Example
{
    int a =10; //By default it will public static and final
    void method1(); // by default it will be abstract and public
    void method2();
    
    default void method3()// By using default method there is no need to add implementation in the classes where this method is used
    {
    	System.out.println("This is a default method");
    }
    static void method4()//We can't override it
    {
    	System.out.println("This is a Static method");
    }
    
}
