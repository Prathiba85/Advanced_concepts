package Advanced_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeMap;

public class Hashmap_candidatevote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> names = new ArrayList();
		names.add("Prathiba");
		names.add("Sri");
		names.add("Prathiba");
		names.add("vimal");
		names.add("Andrew");
		names.add("Andrew");
		
		int n=names.size();
		//electionWinner(names,n);
		System.out.println(electionWinner(names,n));
		

	}
	public static String electionWinner(ArrayList<String>names, int n)
    {
	TreeMap <String ,Integer> hm = new TreeMap();
		int k=0;
		String f ="";
		for(int i=0;i<n;i++)
		{
		
			String s = names.get(i);
			k=(hm.getOrDefault(s,0)+1);
			hm.put(s, k);
			
		}
		System.out.println(hm);
	    int x=hm.size();
		int max = Collections.max(hm.values());
				
			//System.out.println(max);
		
			
			for(Map.Entry<String,Integer> m: hm.entrySet())
			{
				
				if(m.getValue()==max)
				{
		        f = (m.getKey());
				break;
				}
			}
			return f;
				
			
		
    }	

}
