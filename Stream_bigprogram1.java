package Advanced_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_bigprogram1 {
	public static void main(String[] args)
	{
		ArrayList<student> al = new ArrayList<>();
		al.add(new student (100,"Prathiba",70));
		al.add(new student (102,"Vimal",70));
		al.add(new student (103,"sri",100));

		
	double avg = al.stream().mapToInt(x->x.getMarks()).average().getAsDouble();
	
		//student arr[] = {new student (100,"Prathiba",70),new student (101,"senta",80),new student (200,"chitan",60)};
				//double avg = Arrays.stream(arr).mapToInt(x->x.getMarks()).average().getAsDouble();
				
				
		System.out.println("Average "+avg);
		
		Map<Integer, String>m=al.stream().collect(Collectors.toMap(student::getRollno, student::getName));
		System.out.println(m);
		
		Map<Integer, List<student>> ms = al.stream().collect(Collectors.groupingBy(student::getMarks));
		System.out.println(ms);
	}

}

class student
{
	int rollno;
	int marks;
	String name;
	
	student(int r,String n, int  m)
	{
		rollno=r;
		marks=m;
		name=n;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
