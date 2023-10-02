package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileProgram
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		try {
		FileInputStream f=new FileInputStream ("C:/mno.txt");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
