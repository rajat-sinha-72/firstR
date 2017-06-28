package collection1;
import java.io.*;
import java.util.*;

public class iter {
	public static void main (String args[])
	{
		String a[] = {"abc","klm","xyz","pqr"};
		List <String> list1 = Arrays.asList(a);
		Wloop(list1);
	}	
	private static void Wloop(Collection<String> name)
	{
		Iterator<String> nIter = name.iterator();
		while(nIter.hasNext()){
			System.out.println(nIter.next());
		}
	}

} 

