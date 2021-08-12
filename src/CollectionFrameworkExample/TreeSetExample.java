package CollectionFrameworkExample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet<String> fruits = new TreeSet<String>(Comparator.reverseOrder());
     fruits.add("Banana");
     fruits.add("Apple");
     fruits.add("Mango");
     fruits.add("Pineapple");
     fruits.add("Grapes");
     
     System.out.println("Descending of Fruits are " + fruits);
	}

}
