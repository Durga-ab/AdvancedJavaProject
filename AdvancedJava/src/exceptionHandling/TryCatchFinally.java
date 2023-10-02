package exceptionHandling;

public class TryCatchFinally 
{
	public static void main(String[]args)
	{
		try
		{
			int a=10;
			int b=0;
			int c =a/b;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("I m the catch method");
		}
		
		finally
		{
			System.out.println("i m finally method");
		}
		
		System.out.println("I am durga");
		System.out.println("my mockmate name is priya&Tejaswini");
	}

}
