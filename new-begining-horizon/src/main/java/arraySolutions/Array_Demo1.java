package arraySolutions;

public class Array_Demo1 {

	public static void main(String[] args) 
	{
		int[] numbers = {1,2,3,4,5};
		for(int i=0;i<numbers.length;i++)
		{
			
			System.out.println(numbers[i]);
		}
		
		System.out.println("     ");
		for(int number:numbers)
			System.out.println(number);

	}

}
