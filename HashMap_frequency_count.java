package Advanced_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_frequency_count {
	public static void main (String[] args)
	{
		ArrayList al =  new ArrayList();
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(5);
		al.add(10);
		al.add(5);
		
		int n = al.size();
		//frequencyCount(al,n);
		System.out.println(frequencyCount(al,n));
	}
	
	public static ArrayList<Integer> frequencyCount(ArrayList<Integer>arr, int n)
	{
		LinkedHashMap<Integer,Integer> h = new LinkedHashMap();
		ArrayList al = new ArrayList();
		int v=0;
		
		for(int a:arr)
		{
			if(h.containsKey(a))
			{
				 v= (int) h.get(a);
				h.put(a,v+1);
			}
			else
			{
				h.put(a,1);
			}
		}
		System.out.println(h);
		
		
		
		
			
		return al;
	    //Your code here
	}

	//{ Driver Code Starts.


	
	
}
