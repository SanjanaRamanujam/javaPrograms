import java.util.Scanner;
class InvalidAge extends Exception
{
	InvalidAge(String s)
	{
		super(s);
	}
}
public class CommandPrompt {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		try
		{
			String sName=s.next();
			int iAge=s.nextInt();
			s.close();
			if(iAge<18&&iAge>=60)
				throw new InvalidAge("Not Eligible Age");
			else
				System.out.println("Eligible age");
		}
		catch(Exception e)
		{
			System.out.println("Not Eligible age\nAgeException");
		}
	}
}
