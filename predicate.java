package Advanced_concepts;

import java.util.function.Predicate;

public class predicate {
	public static void main(String[] args)
	{
		//print integeger > 10
		Predicate <Integer> p =i->(i>10);
		System.out.println(p.test(5));
		//print string >10
		Predicate<String> s =s2->(s2.length()>10);
		System.out.println(s.test("Prathiba Sankararaj"));
		
		//print array element whose size is >4
		
		String [] arr = {"Prathiba","john","Vimal","sri"};
		
		Predicate<String> pr =s2->(s2.length()<5);
		for(String name:arr)
		{
			if(pr.test(name)==true)
				System.out.println(name);
		}
	}

}
