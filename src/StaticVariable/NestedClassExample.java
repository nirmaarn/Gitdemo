package StaticVariable;

public class NestedClassExample 
{
     private int x= 10;
     private static int y =20;
     
     private class NonStatic{
    	 void display()
    	 {
    		 System.out.println("Private iny x =" +x);
    		 System.out.println(y);
    	 }
     }
     static class StaticNested{
    	 void display() {
    		 //you can't access non static member here
    		 //System.out.println("Private int x = " + x);
    		 
    		 //You can only access the static members
    		 System.out.println("Private Static int = " + y);
    	 }
     }
	public static void main(String[] args) 
	{
	NestedClassExample nc = new NestedClassExample();
	//instatisation of inner non static class
	NestedClassExample.NonStatic nonstatic= nc.new NonStatic();
	nonstatic.display();
	
	//You can directly instatiate nested static class
	StaticNested staticnested = new StaticNested();
	staticnested.display();

	}

}
