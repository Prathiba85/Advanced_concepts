package Advanced_concepts;

import java.util.Arrays;

public class Stream_sort_String {
	public static void main(String[] args)
	{
		String arr[] = {"abc","cde","fch","afc"};
		Arrays.stream(arr)
		.filter(x->x.startsWith("a"))
		.filter(x->x.endsWith("c"))
		.forEach(System.out::println);
		
	}

}
