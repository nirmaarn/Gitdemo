package StaticVariable;

public class StaticVariableExample 
{
   // int incr = 0; //Will get memory each time when the instance is created
    static int incr = 0; //Will get memory only once and retain
	public StaticVariableExample() 
	{
		incr++;
		System.out.println(incr);
	}
    public static void main(String[] args)
	{

      StaticVariableExample a = new StaticVariableExample();
      StaticVariableExample b= new StaticVariableExample();
      StaticVariableExample c = new StaticVariableExample();

	}

}
