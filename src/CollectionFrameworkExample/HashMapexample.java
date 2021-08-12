package CollectionFrameworkExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class HashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap <String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Wadgaon Sheri", new Integer(444556));
        hm.put("Viman Nagar", 1425);
        hm.put("Bhosari", 4456);
        
        System.out.println(hm.entrySet());
        
        //Return Set view
        Set<Map.Entry<String, Integer>> st = hm.entrySet();
        
        for( Map.Entry<String, Integer> me:st)
        {
        	System.out.print(me.getKey() + ":");
        	System.out.println(me.getValue());
        			
        }
	}
	//Difference between comparable and comparator...make sure to read it

}
