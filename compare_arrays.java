package Advanced_concepts;

import java.util.Arrays;

public class compare_arrays {
public static void main (String[] args)
{
	String[] a = {"Geeks","for","Geeks"};
	String[] b = {"geeks","For","geeks"};
	if(Arrays.equals(a, b,String::compareToIgnoreCase));
	{
	System.out.println("Yes");
	}
	
	{
		System.out.println("No");
	}
	

}
}
