package Advanced_concepts;

import java.util.Arrays;
import java.util.List;

public class stream_even {
	public static void main(String[] args)
	{
		List<Integer> asl= Arrays.asList(20,5,10,30);
		
		asl.stream()
		.filter(x->x>10).
		filter(x->x%2==0).
		forEach(System.out::println);
		
		asl.stream()
		.forEach(x->System.out.print((x+=x)));
		
		
		
		
	}

}
