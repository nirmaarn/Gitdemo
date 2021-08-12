package CollectionFrameworkExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList<>();
		list.add("Arnold");
		list.add("12");
		list.add("Jay");
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
//		for( obj:itr)....//This is failing because its going against the law of for each loop
//		{
//			System.out.println(obj);
//		}

	}

}
