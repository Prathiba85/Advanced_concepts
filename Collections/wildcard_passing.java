package Advanced_concepts.Collections;

import java.util.ArrayList;

public class wildcard_passing {
	
	static void printstudent(ArrayList <? extends student> al)
	{
		for (student s : al)
			s.print();
	}
	
	public static void main (String [] args)
	{
		ArrayList<eng_student> al1 = new ArrayList();
		al1.add(new eng_student());
		al1.add(new eng_student());
		ArrayList<manage_student> al2 = new ArrayList();
		al2.add(new manage_student());
		al2.add(new manage_student());
		printstudent(al1);
		printstudent(al2);
		
				
	}

}
class student
{
	void print()
	{
		System.out.println("All stuedents");
	}
}

class eng_student extends student {
	void print()
	{
		System.out.println("This is engg student");
	}
}
class manage_student extends student {
	void print()
	{
		System.out.println("This is management student");
	}
}