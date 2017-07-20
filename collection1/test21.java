package collection1;
import java.io.*;
import java.util.*;

public class test21 {

	public static void main(String args[]){

		System.out.println("Path = " + System.getenv("PATH"));
		Map env=System.getenv();
		   
	      Set s=env.entrySet();
	      Iterator i=s.iterator();
	      
	      while(i.hasNext()){
	    	  Map.Entry m=(Map.Entry)i.next();
	    	  System.out.print("Key  = " + m.getKey()+ " Value = ");
	    	  System.out.println(m.getValue());
	      }


	}}

