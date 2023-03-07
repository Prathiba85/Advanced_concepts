package Advanced_concepts.Collections;

public class locker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m;
		System.out.println(closedLockers(12,3));

	}
	public static int closedLockers(int n,int m)
	{
		boolean arr[]= new boolean[n+1];
		int count =0;
		int loc=1;
		final int a =10,b=20;
		for (int i=1;loc<n;i++)
		{
			loc = i*m;
			
			arr[loc]=true;
			count = count+1;
			
				
		}
		//System.out.println(count= n-count);
		
		
		
		System.out.println(count);
	
		
	/*
		for(int i=1;i<=n;i++)
		{
			if (arr[i]==false)
			{
				//System.out.println(( "for i "+i+ " "+arr[i]));
				count = count+1;
			}
			//System.out.println((count));
		}
		return count;*/
		
		//solution
		if(m==0)
			return n;
		else
		{
			int answer = n-(int) (Math.floor((n/m)));
			System.out.println(Math.floor(n/m));
		}
		return count;
		
	}

}
