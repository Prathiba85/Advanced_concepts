package Advanced_concepts.Collections;

import java.util.ArrayList;

public class contains_all {
	
	//boolean containsall(Collection <?>
	
	public static void main (String[] args)
	{
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		ArrayList al1 = new ArrayList();
		al1.add(20);
		al1.add(30);
		
		System.out.println(al.containsAll(al1));
		
	}

}
