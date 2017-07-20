package collection1;
import java.io.*;
import java.util.*;

public class test16 {

	public static void main(String args[]){
		Set<Integer> s = new HashSet<Integer>();

		for(int i = 0; i < 5; i++) {
			s.add(i);
		}
		Iterator<Integer> nIter = s.iterator();
		while(nIter.hasNext()){
			System.out.println(nIter.next());
		}
		
		Set<Integer> d = new LinkedHashSet<Integer>();
		d.add(3);
		d.add(4);
		d.add(3);
		d.add(5);
		
		Iterator<Integer> niIter = d.iterator();
		while(niIter.hasNext()){
			System.out.println(niIter.next());
	}
}}
