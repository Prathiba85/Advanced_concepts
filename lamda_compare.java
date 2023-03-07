package Advanced_concepts;

import java.util.Arrays;

public class lamda_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		point arr[] = {new point (10,20),new point (5,30),new point (30,40)};
		Arrays.sort(arr, (p1,p2)->p1.x-p2.x);
		for(point a: arr)
		{
			System.out.println(a.x+" "+a.y);
		}
		

	}

}

class point
{
	int x,y;
	point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
