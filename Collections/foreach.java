package Advanced_concepts.Collections;

import java.util.Arrays;
import java.util.List;

public class foreach {
	public static void main (String[] args)
	{
		//for each Void forEach(Consumer<?super T> action) --> Super means you have that class or parent of that class
		
		List<Integer> al = Arrays.asList(10,20,30);
		al.forEach(x->System.out.println(x));
	}

}
