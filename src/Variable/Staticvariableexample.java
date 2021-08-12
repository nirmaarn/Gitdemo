package Variable;

public class Staticvariableexample 
{
    int id;
    String  name;
    static String Company = "CTS";
    
   Staticvariableexample(int r, String n)
   {
	   id = r;
	   name = n;
   }
   void display()
   {
	   System.out.println(id+ " " +name +" " + Company);
   }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Staticvariableexample a1 = new Staticvariableexample(26, "Arnold");
		Staticvariableexample a2 = new Staticvariableexample(52, "Nirmal");
		
		a1.display();
		a2.display();

	}

}
