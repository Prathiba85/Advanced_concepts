package Advanced_concepts;

import java.math.BigInteger;

public class Fibbanachi {
	public static void main (String[] args)
	{
		 BigInteger c = BigInteger.valueOf(0);
		int n=2;
		int x =121;
		System.out.println(calcualte(n));
		System.out.println(prime(x));
		System.out.println(nextprime(x));
	}
 static BigInteger calcualte(int n)
 {
	 BigInteger a = BigInteger.valueOf(1);
	 BigInteger b = BigInteger.valueOf(1);
	 BigInteger c = BigInteger.valueOf(0);
	 
	 if (n==1)
	 {
		 c=BigInteger.valueOf(1);;
		 return c;
	 }
		
	
		 else {
	 for (int j=2;j<=n;j++)
	 {
		 c=a.add(b);
		 a=b;
		 b=c;
	 }
	 
	return c;
		 }
	 
 }
 static boolean prime(int  x)
 {
	 BigInteger d = BigInteger.valueOf(x);
	 System.out.println(d);
	
	return d.isProbablePrime(1);
	 
 }
 static int nextprime(int  x)
 {
	 BigInteger d = BigInteger.valueOf(x);
	 BigInteger s = d.nextProbablePrime();
			String s1= s.toString();
			
	
	return (Integer.parseInt(s1));
	 
 }
}
