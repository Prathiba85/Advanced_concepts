package Advanced_concepts;

import java.util.stream.Stream;

public class Stream_infinite {
	public static void main(String[] args)
	{
		//print first 10 numbers contains 5 
		
		Stream.iterate(1,x->x+1)
		.filter(x->x.toString().contains("5"))
		.limit(10)
		.forEach(System.out::println);
	}

}
