package Advanced_concepts;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new TreeMap<>();
		m.put(10,"vinay");
		m.put(20,"kenya");
		m.put(1,"shanti");
		m.put(60, "Fun");
		System.out.println(m);
		
		for(Map.Entry<Integer,String> e:m.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		if(m.containsKey(60))
			System.out.println("yes");
		else 
			System.out.println("No");
	
		System.out.println(m.remove(1));

	}

}
