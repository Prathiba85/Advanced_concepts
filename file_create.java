package Advanced_concepts;
import java.io.*;
import java.util.Scanner;
public class file_create {
public static void main(String[] args)
{
	try {
		File obj =new File("login.txt");
		if (obj.createNewFile())
		{
		System.out.println("File created successfully");
		}
		else
		{
			System.out.println("unable to create file successfully");
		}
		
	}
	catch(IOException e)
	{
		System.out.println("unable to create the file");
	}
	File obj = new File("login.txt");
	if (obj.exists())
	{
		System.out.println(obj.getName());
		System.out.println(obj.getAbsolutePath());
	}
	
	try {
		FileWriter wr = new FileWriter("login.txt");
		wr.write("This is javaprogram");
		wr.close();
	}
	catch (IOException e)
	{
		System.out.println("Unable to write to the file");
	}
	
	try
	{
		File obj1 = new File("login.txt");
		Scanner sc = new Scanner(obj1);
		while (sc.hasNext()) {
			String data = sc.nextLine();
			System.out.println(data);
			
			System.out.println(data.length());
		}
		
	}
	catch (IOException e)
	{
		System.out.println("Unable to read to the file");
	}
	
	
	
	
}
	

}
