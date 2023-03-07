package Advanced_concepts;
import java.util.*;
import java.util.function.Predicate;

public class predicate_pause_object {
	
	public static void main(String[] args)
	{
		employee emp = new employee("Prathiba",50000,3);
		
		
		Predicate<employee> pr =e->((e.salary>20000)&& (e.experience>2));
		if(pr.test(emp)==true)
			System.out.println(emp.name);
		
		ArrayList<employee> al = new ArrayList<employee>();
		al.add(new employee("Prathiba",50000,3));
		al.add(new employee("Vimal",35000,2));
		al.add(new employee("Sri",60000,5));
		al.add(new employee("prabhu",35000,4));
		
		for(employee a:al)
		{
			
			if(pr.test(a))
			{
				System.out.println("name is "+a.name+" and experience is :"+a.experience);
			}
			
		}
	}

}

class employee{
	String name;
	int salary;
	int experience;
	employee( String name , int salary,int experience)
	{
		this.name=name;
		this.salary=salary;
		this.experience=experience;
	}
	
}
