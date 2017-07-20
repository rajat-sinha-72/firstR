package collection1;
import java.io.*;
import java.util.*;
public class test14 {

	public static void main(String args[]){
		ArrayList <String> t1 = new ArrayList<>();
		t1.add("Rajat");
		t1.add("Raja");
		t1.add("Raj");
		t1.add("Raj");
		t1.add("Ra");
		
		  Enumeration e = Collections.enumeration(t1);

		    while (e.hasMoreElements())
		      System.out.println(e.nextElement());
	}
	
}
