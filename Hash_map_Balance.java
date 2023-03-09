package Advanced_concepts;

import java.util.HashMap;

public class Hash_map_Balance {
public static void main(String[] args)
{
	HashMap <Integer,Integer> h = new HashMap<>();
	h.put(1, 100);
	h.put(2, 2000);
	h.put(3, 500);
	System.out.println(get_balance(h,1));
	set_balance(h,100,50000);
	System.out.println(h);
	
}


	
public static int  get_balance(HashMap h,int i)

{
	Object k =  h.get(i);
	return (int) k;
	
}
public static void set_balance(HashMap h,int k,int v)

{
   h.put(k,v);
	
	
}

}
