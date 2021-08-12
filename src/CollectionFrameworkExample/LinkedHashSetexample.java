package CollectionFrameworkExample;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
      linkedset.add("Arry");
      linkedset.add("Arnold");
      linkedset.add(null);
      //This will not add new element as Arry already exists
      linkedset.add("Arry");
      
      System.out.println("Linkedset size is " + linkedset.size());
      System.out.println("Original LinkedHashset = " + linkedset);
      System.out.println("Removing D from LinkedHashset = "+ linkedset.remove("Arnold"));
      System.out.println("Trying to remove Z which is not present = " + linkedset.remove("d"));
      System.out.println("Checking if A is present = " + linkedset.contains("Prachi"));
      System.out.println("Updated linkedhashset = " + linkedset);
      
     
	  Iterator<String>  itr = linkedset.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	}

}
