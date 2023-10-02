package exceptionHandling;

public class ArithmaticExeception 
{
	public static void main(String[]args)
	{
		try
		{
		 int a=10;
	     int b=20;
		 int c=20/0;
		}
		
	    catch(Exception e)
	   {
		e.printStackTrace();//Best and Preffered
		//Exception name
		//DEscription
		//StackTrace
		
		System.out.println("--------------");
		System.out.println(e);
		//Exception name
		//Description
		
		System.out.println("-----------------");
		
		System.out.println(e.getMessage());
		//Description
	   }

}
}
