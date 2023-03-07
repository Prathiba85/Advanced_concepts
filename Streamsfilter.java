package Advanced_concepts;
import java.util.*;
import java.util.stream.Collectors;
public class Streamsfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum=0;
		List <Integer> numberslist = (List<Integer>) Arrays.asList(10,15,20,25,30);
		
		List <Integer> evenlist = new ArrayList<Integer>();
		evenlist= numberslist.stream().filter(n->(n%2==0)).collect(Collectors.toList());
		System.out.println(evenlist);
		numberslist.stream().filter(n->((n%2)==0)).forEach(n->System.out.println(n));;
		numberslist.stream().filter(n->((n%2)==0)).forEach(System.out::print);;
		
		
		
	
		
	}

}
