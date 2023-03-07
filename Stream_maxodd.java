package Advanced_concepts;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream_maxodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[] = {1,2,3,4};
	int s =Arrays.stream(arr)
			.filter(x->x%2!=0).max().getAsInt();
	
System.out.println(s);
	}

}
