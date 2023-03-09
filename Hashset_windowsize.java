package Advanced_concepts;

import java.util.HashSet;

public class Hashset_windowsize {
	public static void main (String[] args)
	{
		//Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
		int[] arr = {4,5,0};
         int n=5;
         System.out.println(findsum(arr,n));
}
static boolean findsum(int arr[],int n)
{
    //Your code here
    int window_size=0;
    HashSet<Integer> set=new HashSet<Integer>();
    for(int i=0;i<n;i++)
    {
        set.add(window_size);
        window_size+=arr[i];
        if(set.contains(window_size))
        {
            return true;
            
        }
    }
    return false;
}
}