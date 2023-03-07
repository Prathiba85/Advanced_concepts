package Advanced_concepts;

public class lamda_function2_singleparameter {
	
static void fun(Test2 t2,Integer p)
{
	t2.display(p);
}

public static void main(String[] args)
{
	fun((p->System.out.println(p)),10);
}

}

interface Test2{
	void display(Integer p);
}
