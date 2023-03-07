package Advanced_concepts.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example_stream {
	public static void main (String[] args)
	{
	
		int[] arr = {10,10};
		List<Integer> a = new ArrayList();
		for(int i: arr)
			a.add(i);
		System.out.println(a);
		
		
		a.stream().forEach((x)->x=x+x);
		
		List first = new ArrayList<>();
		first.add(1);
		first.add(2);
		System.out.println(first);
		
		
	

}
}
