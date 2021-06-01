package javaSolutions;

//5!= 1*2*3*4*5
public class FactorialOfGivenNumber 
{

	public static void main(String[] args) 
	{
	 
       int num = 5;
       int temp=1;
       for(int i=1;i<=num;i++)
    	   
       {
    	   temp  = temp*i;
       }
       System.out.println(temp);
	}

}
