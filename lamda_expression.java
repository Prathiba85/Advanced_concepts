package Advanced_concepts;

import java.util.Arrays;
import java.util.List;

public class lamda_expression {
	public static void main (String[] args)
	{
		
		List <Integer> al = Arrays.asList(10,20,30,40);
		//Lamda Expression
		//al.forEach(x->System.out.println(x));
		al.forEach(System.out::println);
		/* Lamda return statement
		 *  return()->
    {
        System.out.println("Hello");
    };
		 */
		
	}

}
