package javaSolutions;

public class MethodOverloadingQuestion1
{


	public void sum(int a , int b)
	{
		System.out.println(a+b);
	}

	public double sum(double a, int b)
	{
	  return a+b;
	}

public static void main(String args[])
{
	MethodOverloadingQuestion1 q1= new MethodOverloadingQuestion1();
    //q1.sum(10, 20);
	double second_one= q1.sum(12.7, 20);
	System.out.println(second_one);
}

}
