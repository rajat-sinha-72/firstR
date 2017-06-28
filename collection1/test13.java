package collection1;
import java.io.*;
import java.util.*;

public class test13 {

	public static void main(String args[]){
		ArrayList <String> t1 = new ArrayList<>();
		t1.add("Rajat");
		t1.add("Raja");
		t1.add("Raj");
		t1.add("Ra");
		t1.add("R");
		
		Vector <String> vec = new Vector<>();
		vec.addElement("Shubham");
		vec.addElement("Shubha");
		vec.addElement("Shubh");
		
		t1.addAll(1,vec);
		
		for (int i=0;i<t1.size();i++)
			System.out.println(t1.get(i));
	}}

