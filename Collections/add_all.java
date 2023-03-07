package Advanced_concepts.Collections;

import java.util.ArrayList;
import java.util.List;

public class add_all {
	public static void main(String[] args)
	{//Syntax boolean addAll(Collection <?extends E> C)
		//remove all --> boolean removeAll Collection (<?> C)
		//retain all --> boolean retainAll Collection (<?> C)
		
		
		List l1= new ArrayList();
		l1.add(20);
		l1.add(30);
		
		List l2= new ArrayList();
		l2.add(50);
		
		System.out.println(l2.addAll(l1));
		System.out.println(l2);
		System.out.println(l2.removeAll(l1));
		System.out.println(l2);
		System.out.println(l1.retainAll(l2));
		System.out.println(l2);
		
		
		//predicate boolean removeIf(Predicate <?super E> filter)
		
		List<Integer> ls = new ArrayList();
		ls.add(10);
		ls.add(15);
		ls.add(30);
		ls.add(30);
		ls.removeIf((n)->(n>2));
		
		System.out.println(ls);
	}

}
