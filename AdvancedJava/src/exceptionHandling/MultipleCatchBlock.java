package exceptionHandling;

public class MultipleCatchBlock 
{
	public static void main(String[]args)
	{
		try
		{
			int a=10;
			int b=20;
			int c=a/b;
		}
		
		catch(ArithmeticException a)//child
		{
			a.printStackTrace();
			System.out.println("hello");
		}
		
		catch(Exception e)//parent
		{
			e.printStackTrace();
			System.out.println("bye");
		}
	}

}
