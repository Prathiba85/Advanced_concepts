package Advanced_concepts;
import java.io.*;
import java.util.Scanner;

public class file {
	public static void main(String[] args)
	{
		//create the file - Files are clreated in the folder -C:\Users\sanpr\exlipsefolder 2\test
		try {
			File obj = new File("Hello.txt");
			if (obj.createNewFile())
			{
				System.out.println(obj.getName());
			}
			else
			{
				System.out.println("File already exists");
			}
			
		}
		catch(IOException e)
		{
			System.out.println("An error occurred");
		}
		File obj = new File("Hello.txt");
		if(obj.exists())
		{
			System.out.println(obj.getName());
			System.out.println(obj.length());
			System.out.println(obj.getAbsolutePath());
			System.out.println(obj.canWrite());
			System.out.println(obj.canRead());
		}
		
		try {
			FileWriter wr = new FileWriter("Hello.txt");
			wr.write("Java is programming language");
			wr.close();
			System.out.println("Successfully written");
			
		}
		catch(IOException e)
		{
			System.out.println("An error occurred");
		}
		
		try
		{
			File r = new File("Hello.txt");
			Scanner myReader = new Scanner(r);
			while(myReader.hasNext())
			{
				String data =myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
			
		}
		catch(Exception e)
		{
			System.out.println("An error occurred");
		}
	}

}
