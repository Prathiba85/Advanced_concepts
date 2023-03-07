package Advanced_concepts;

public class lamda_function2_multiparameter2 {
	
static void fun(Test3 t3,Integer p1,Integer p2)
{
	t3.display(p1 ,p2);
}

public static void main(String[] args)
{
	fun((p1,p2)->System.out.println(p1+" "),20,10);
}

}

interface Test3{
	void display(Integer p1,Integer p2);
}
