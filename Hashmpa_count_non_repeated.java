package Advanced_concepts;

import java.util.HashMap;
import java.util.Map;

public class Hashmpa_count_non_repeated {
	public static void main(String[] args)
	{
		int[] arr = {1,1,2,2,3,3,4,5,6,7};
		
		int n = arr.length;
		System.out.println(countNonRepeated(arr,n));
	}
	static long countNonRepeated(int arr[], int n)
    {
		HashMap <Integer,Integer> s= new HashMap();
		int value=0;
		int count = 0;
		
		for (int a : arr)
		{
			if(s.containsKey(a))
			{
				int k = s.get(a);
				s.put(a,k+1);
			}
			else
			{
				s.put(a, 1);
			}
		}
		
		//System.out.println(s);
		for(Map.Entry<Integer,Integer>e:s.entrySet())
		{
			if(e.getValue()==1)
				count = count+1;
		}
		
		return count;
        // add your code
    }
}
