package Advanced_concepts;

import java.io.IOException;

public class Exception_Handling {
	public static void main(String[] args)
	{
	int a = 777;
	int b= 915;
	
	TestClass obj = new TestClass(a, b);
	obj.findMin();
	

}
}

class TestClass
{
	int a,b,Min;
	TestClass(){}
	TestClass(int x, int y)
	{
		this.a = x;
		this.b=y;
		this.Min = Integer.MAX_VALUE;
	}
	public void findMin()
    {
        
        // Add your code here. 
        // method findMin() which prints the Minimum value of a$b.
		
		int addition =0;
		int multiplication =0;
		int division =0;
		int subtraction =0;
		try
		{
			addition = a+b;
			
			subtraction = a-b;
			multiplication = a*b;
			division =a/b;
		}catch (ArithmeticException e) {
			 
			e.printStackTrace();
		} finally {
		
			if((addition<=subtraction)&&(addition<=multiplication)&&(addition<=division))
				System.out.println(addition);
			else if((subtraction<=addition)&&(subtraction<=multiplication)&&(subtraction<=division))
				System.out.println(subtraction);
			else if((multiplication<=addition)&&(multiplication<=subtraction)&&(multiplication<=division))
				System.out.println(multiplication);
			else if ((division<=addition)&&(division<=subtraction)&&(division<=multiplication))
				System.out.println(division);
		}
		}
	    
        
        
    }

