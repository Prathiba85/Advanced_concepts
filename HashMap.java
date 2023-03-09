package Advanced_concepts;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap {
	public static void main(String[] args) {
		//int arr[] = {7,4,0,9,4,8,8,2,4,5,5,1 };
		//int arr[] = {1,5,3,4,3,5,6};
		int arr[] = {3,7,0,9};
		int n = arr.length;
		System.out.println(firstRepeated(arr,n));
	}

	public static int firstRepeated(int[] arr, int n) {

		LinkedHashMap<Integer, Integer> hs = new LinkedHashMap<>();
		int ans = 0;
		int i=0;
		int f=0;
		boolean flag =false;

		for (i = 0; i <arr.length; i++) 
		{
			//System.out.println(i);
			if (hs.containsKey(arr[i])) {
				int value= hs.get(arr[i]);
				hs.put(arr[i],value+1);
				//System.out.println(hs);
				
				
				
			}
			else
			{
				hs.put(arr[i],1);
				
				
			}
		}
		//System.out.println(hs);
		
		for(Map.Entry<Integer,Integer> e :hs.entrySet())
		{
			if(e.getValue()>1)
			{
				 f =e.getKey();
				 flag =true;
				//System.out.println(e.getKey());
				break;
			}
		}
		
		for( i=0;i<n;i++)
		{
			if(arr[i]==f)
			{
				 ans = i+1;
			break;
			}
			
		}
		
		if (flag==true)
		{
		return ans;
		}
		else
			return -1;
		// Your code here
	}

}
