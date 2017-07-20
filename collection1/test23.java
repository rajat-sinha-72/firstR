package collection1;
import java.io.*;
import java.util.*;

public class test23 {
 
	public static void main(String args[]){
	Map	<String,Integer> atomNums = new TreeMap<String,Integer>();
	atomNums.put("Rajat",98);
	atomNums.put("Raja",18);
	atomNums.put("Raj",8);
	atomNums.put("Ra",99);
	atomNums.put("R",9);
	
	System.out.println("Size is "+ atomNums.size());
	
	System.out.println("Map values :");
    Set keys = atomNums.keySet();
    for (Iterator i= keys.iterator();i.hasNext();){
    		String key = (String) i.next();
    	     Integer value = (Integer) atomNums.get(key);
    	     System.out.println(key + " = " + value);
    	   }
    if(atomNums.containsValue(19))
    	System.out.println("yes treemap has value " + 9);
    else 
    	System.out.println("Sorry");
    if(atomNums.containsKey(" "))
    		System.out.println("YES Rajat");
    else
    	System.out.println("Sorry");
	}
	  
	}

