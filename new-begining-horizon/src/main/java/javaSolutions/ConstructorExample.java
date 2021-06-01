package javaSolutions;

class Test
{
	int count;
	
	
	Test()
	{
		count++;
	}
	
	public void printNumber()
	{
		System.out.println(count);
	}
}


public class ConstructorExample
{

	public static void main(String[] args)
	{
		Test a = new Test();
		Test b = new Test();
		Test c = new Test();
		
      a.printNumber();
      b.printNumber();
      c.printNumber();
	}

}
