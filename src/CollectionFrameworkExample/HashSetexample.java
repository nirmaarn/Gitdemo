package CollectionFrameworkExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetexample {

	public static void main(String[] args) 
	{
		//creating hashset
		Set hs = new HashSet();
		
		boolean b1 = hs.add("Arnold");
		boolean b2 = hs.add("Jay");
		hs.add("Prachi");
		hs.add("Sid");
		hs.add(null);
		hs.add(null);
		//adding duplicate element
        boolean b3 =hs.add("Arnold");
		//printing b1,b2,b3
        
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
	 
        //printing all elements of hashset
        System.out.println(hs);	
	}

}
