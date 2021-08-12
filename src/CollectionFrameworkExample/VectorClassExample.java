package CollectionFrameworkExample;

import java.util.Vector;

public class VectorClassExample {

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(0, "Hmm");
		v.add(1,2);
        v.add(2, "Bht ho gaya");	
        v.add(3, "Test");
		System.out.println(v.get(2));
		System.out.println(v.get(1));
		System.out.println("Vector is" + v);
System.out.println(v.get(3));
//USed for thread safety.......if its implementation is on 2 programs then changes made over here should not affect the other one
	}

}
