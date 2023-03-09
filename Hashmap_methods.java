package Advanced_concepts;

import java.util.HashMap;

public class Hashmap_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put(1,2);
		hm.put(2,50);
		hm.put(3,100);
		hm.put(4,100);
		int x =10;
		
		System.out.println(find_value(hm,x));
		System.out.println(hm.size());
		hm.remove(3);
		System.out.println(hm);
		

	}
	
	
	static int find_value(HashMap<Integer, Integer> hm, int x)
    {
		if(hm.containsKey(x))
			return hm.get(x);
		return -1;
        //Your code here
        
    }
}
