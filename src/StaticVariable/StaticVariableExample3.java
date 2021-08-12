package StaticVariable;

public class StaticVariableExample3
{
	 String name;
	int roll_no;
	static String college = "Carmel";
 static void change()
 {
	college = "Pallotti";
	//roll_no= 123;

 }
public StaticVariableExample3(int r, String n)
{
   roll_no = r;
   name = n;
   
}

void display (){System.out.println(roll_no  + " " + name+ " "+ college);
	

}

}
