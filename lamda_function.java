package Advanced_concepts;

public class lamda_function {
	
static void fun(Test1 t1)
{
	t1.display();
}

public static void main(String[] args)
{
	fun(()->System.out.println("Hello"));
}

}

interface Test1{
	void display();
}
