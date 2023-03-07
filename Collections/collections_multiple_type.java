package Advanced_concepts.Collections;

public class collections_multiple_type {
	public static void main (String[] args)
	{
		//Thsi is to check the compiler erroe
		test <Integer , String>  obj = new test<>();
		obj.x =10;
		obj.y= "GF";
		String s = (obj.x).toString();
		System.out.println(s);
		
	}

}
class test<T,S>
{
	T x;
	S y;
	
}