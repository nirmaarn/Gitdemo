package ConstructorExample;

public class Constructors
{
         String name;
         int id;
         
         Constructors(String n, int i)
         {
        	 name= n;
        	 id= i;
         }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Constructors c= new Constructors("Arnold", 1993);
		System.out.println("Name is "+ c.name  +  "\n" + " Birth Year is " + c.id );
	}

}
