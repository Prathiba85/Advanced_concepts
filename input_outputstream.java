package Advanced_concepts;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class input_outputstream {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("Hello.txt");
			FileOutputStream out = new FileOutputStream("Bye.txt");
			int c;
			while ((c = in.read()) != -1) {

				out.write(c);
			}
		} catch (IOException e) {
			 
			e.printStackTrace();
		} finally {
			in.close();
			out.close();
			
		}
		}

	}



