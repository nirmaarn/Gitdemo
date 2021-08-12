package Variable;

public class Localvariableexample2
{
	public Localvariableexample2() 
	{
		// TODO Auto-generated constructor stub
	int num=10;
	num = num + 10;
	System.out.println(num);
	}
	
    public void name()
    {
    	float f=10.5f;
    	int n = (int) f;//This is called type casting(Narrowing)
    	System.out.println(n);
    }
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         System.out.println("Hello Welcome to Tech Bodhi");
         Localvariableexample2 lc = new Localvariableexample2();
         lc.name();
	}

}
