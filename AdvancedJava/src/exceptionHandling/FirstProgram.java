package exceptionHandling;

public class FirstProgram
{
	public static void main(String[]args) 
	{   try
	   {
		System.out.println("1");
	    System.out.println("2");
	    System.out.println("3");
	    System.out.println(2/0);
		System.out.println("4");
	   }
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println(e);
	}
	}

}
