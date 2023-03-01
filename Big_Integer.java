package Advanced_concepts;

import java.math.BigInteger;

public class Big_Integer {
	public static void main (String [] args)
	{
		int n=1000;
		BigInteger B = new BigInteger("1");
		for(int i=1;i<=n;i++)
		{
			B = B.multiply(BigInteger.valueOf(i));
		}
		
		String S = B.toString();
		System.out.println(S.length());
	}
	

}
