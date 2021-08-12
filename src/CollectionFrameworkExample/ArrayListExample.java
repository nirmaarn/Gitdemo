package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();//if not given <String> the it will accept all types of datatypes
		list.add("ARNOLD");
		list.add("PRACHI");
		list.add("JAY");
		list.add("SID");
		//Transferring list through Iterator
		Iterator<String> itr = list.iterator();
//		while(itr.hasNext())
//		{
		//	System.out.println(itr.next());
	//}
	//transversing through for each loop
		for(String obj:list)
		System.out.println(obj);
		
	}

}
