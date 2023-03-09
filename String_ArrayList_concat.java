package Advanced_concepts;

import java.util.ArrayList;
import java.util.Iterator;

public class String_ArrayList_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("geeks");
		al.add(" ");
		al.add("for");
		System.out.println(concatenateStrings(al));
		
	}
	public static String concatenateStrings(ArrayList<String>arr)
	{
		String s="";
		Iterator itr = arr.iterator();
		String f = "";
		while(itr.hasNext())
		{
			
			s= s+itr.next();
					
		}
	String su[] = 	s.split(" ");
	
	for(String a : su)
	{
		 f = f+a;
	}
		
	return f;
	    //Your code here
	}
}
