package Advanced_concepts;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Stream_add {
	public static void main(String[] arg)
	{
		int arr[] ={30,20,10};
		int sum = Arrays.stream(arr).sum();
		int max = Arrays.stream(arr).max().getAsInt();
	OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(sum);
		System.out.println(max);
		System.out.println(avg);
	}

}
