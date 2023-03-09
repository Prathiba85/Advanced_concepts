package Advanced_concepts;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_getordefault {
	public static void main (String [] args)
	{
		//You have to find the frequency of array
		int arr[]= {10,5,20,5,10,5};
		LinkedHashMap m = new LinkedHashMap();
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			k=1+(int) m.getOrDefault(arr[i],0);
			m.put(arr[i],k);
		}
		System.out.println(m);
	}

}
