package Practice;

class Abstractclass_Practice_Implementation  extends Abstractclass_Practice 
{

Abstractclass_Practice_Implementation(int r, String s) {
		super(r, s);
		// TODO Auto-generated constructor stub
	}


public static void main(String[] args)
{
	
	Abstractclass_Practice p = new Abstractclass_Practice(89, "Arnold") {
	};
		p.display();
	}



}
