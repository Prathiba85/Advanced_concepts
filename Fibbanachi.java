package Advanced_concepts;

import java.math.BigInteger;

public class Fibbanachi {
	public static void main (String[] args)
	{
		 BigInteger c = BigInteger.valueOf(0);
		int n=100;
		System.out.println(calcualte(n));
		System.out.println(prime(c));
		System.out.println(nextprime(c));
	}
 static BigInteger calcualte(int n)
 {
	 BigInteger a = BigInteger.valueOf(0);
	 BigInteger b = BigInteger.valueOf(1);
	 BigInteger c = BigInteger.valueOf(0);
	 
	 for (int j=1;j<=n;j++)
	 {
		 c=a.add(b);
		 a=b;
		 b=c;
	 }
	 
	return c;
	 
 }
 static boolean prime(BigInteger c)
 {
	
	return c.isProbablePrime(1);
	 
 }
 static int nextprime(BigInteger c)
 {
	 BigInteger s = c.nextProbablePrime();
			String s1= s.toString();
			
	
	return (Integer.parseInt(s1));
	 
 }
}
