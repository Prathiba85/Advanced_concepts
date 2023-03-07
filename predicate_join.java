package Advanced_concepts;

import java.util.function.Predicate;

public class predicate_join {
	
	public static void main (String[] args)
	{
		//Joining predicates - and , or ,negate
		//=-- check number is even
		//p2--checks greater than 50 or not
		int arr [] = {5,10,15,25,30,35,40,45,50,60,65};
	
		
		Predicate<Integer> p1 = i->i%2==0;
        Predicate<Integer> p2 = i->(i>50);
        
        for(int a :arr)
        {
        	if(p1.test(a)&&p2.test(a)==true)
        		System.out.println(a);
        }
	}

}
