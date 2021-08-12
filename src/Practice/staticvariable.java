package Practice;

public class staticvariable 
{
  int id;
  String name;
  static String college_name = "Pallotti";
  
public staticvariable( int i, String n ) 
{
	id = i;
	name = n;
}  
void display() 
{
	System.out.println(id +" " + name +" " + college_name);
}
public static void main(String[] args)
{
	staticvariable s = new staticvariable(25, "Arnold");
	s.display();
	staticvariable s1 = new staticvariable(26, "Jay");
	s1.display();
}
}
