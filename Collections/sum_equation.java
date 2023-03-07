package Advanced_concepts.Collections;

import java.util.Scanner;

public class sum_equation {
	public static void main (String [] args)
	{
		int n =3;
		
		System.out.println(equationSum(n));
	}
	public static int equationSum(int n)
	{
		int T=0;
		int sum = 0;
		//Scanner sc = new Scanner (System.in);
		//n = sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			T =  ((2*i)+((i+1)*(i+1))-((i*i)+4));
			//System.out.println(T);
			
			sum = sum+T;
		}
		
		return sum;
	}

}


