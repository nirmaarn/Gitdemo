package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample_withoutArgument 
{
  public static void main(String[]args)
  {
	  ArrayList list = new ArrayList<>();
	  list.add("Arnold");
	  list.add("12");
	  
  
    Iterator itr = list.iterator();

	while(itr.hasNext())
		System.out.println(itr.next());
	

}
 
  
}
