package Advanced_concepts;

import java.util.Arrays;
import java.util.List;

public class pausingmethods {
	
	public static void main (String[] args)
	{
		List<Integer> al = Arrays.asList(10,20,30,40);
		al.forEach(pausingmethods::multiply);
		
	}
	
	static void multiply(Integer x)
	{
		System.out.println(x*x);
	}

}
