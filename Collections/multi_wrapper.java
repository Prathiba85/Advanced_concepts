package Advanced_concepts.Collections;


public class multi_wrapper {
	public static void main (String[] args)
	{
		mygen<Integer> m1 = new mygen<>();
		mygen<String> m2 = new mygen<>();
		System.out.println(mygen.count);
		
	}

}
class mygen <T>
{
	T x;
	static int count;
	
	mygen()
	{
		count++;
	}
}