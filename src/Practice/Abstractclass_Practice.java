package Practice;

abstract class Abstractclass_Practice 

{
int rollno;
String name;
 static String college = "Ramdeobaba";
 
 Abstractclass_Practice(int r , String s ) 
 {
	rollno= r;
	name = s;
} 
  void display() {
	  System.out.println(rollno + name);
  }

}
