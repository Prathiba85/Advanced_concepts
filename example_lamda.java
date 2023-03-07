package Advanced_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class example_lamda {
	
	public static void main(String[] args)
	{
		ArrayList <Integer> al = new ArrayList<Integer> (Arrays.asList(10,15,33,40,50));
		
		print(al,x->x%2==0);
		
		
	}
	
	static void print (Collection al,Predicate<Integer> p)
	{
		for(Object a:al)
		{
			if(p.test((Integer) a)==true)
				System.out.println(a);
		}
			
	}

}
