package Advanced_concepts;

public class String_passwordcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "eHello123@";
		System.out.println(validate(str));

	}
	 public static boolean validate(String str)
	    {
	          //Your code here
	          int count =0;
	          char Alpha []= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	          char low_alpha[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	          char spec[] = {'@','#','$','-','*'};
	          int count_length =0;
	          int count_low_alpha=0;
	          int count_alpha =0;
	          int count_spec=0;
	          int allcount =0;
	          if(str.length()<10)
	        	  return false;
		     
	          for(int i=0;i<str.length();i++)
	          {
	            char x =str.charAt(i);
	            
	            if (count_alpha <1)
	            {
	            for (int j=0;j<Alpha.length;j++)
	            {
	            	if (x==Alpha[j])
	            	{
	            		count_alpha =count_alpha+1;
	            	}    			
	            }
	            }
	            
	            if (count_low_alpha <0)
	            {
	            for (int j=0;j<low_alpha.length;j++)
	            {
	            	if (x==Alpha[j])
	            	{
	            		count_low_alpha =count_low_alpha+1;
	            	}    			
	            }
	            }
	            if (count_spec <0)
	            {
	            for (int j=0;j<spec.length;j++)
	            {
	            	if (x==spec[j])
	            	{
	            		count_spec =count_spec+1;
	            	}    			
	            }
	            }
	            allcount =count_length+count_low_alpha+count_alpha+count_spec;
	            System.out.println(allcount);
	         
	          }
	            
	           
	            
	         
	          
	    
	          if(allcount>3)
	            	return true;
	            else
			return false;
			

	    }}
