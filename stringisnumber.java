import java.util.*;
public class stringisnumber {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.next();
	char cStr[]=sStr.toCharArray();
	int iCount=0;
	for(int i=0;i<cStr.length;i++)
	{
		if(Character.isDigit(cStr[i]))
		{
			iCount++;
		}
	}
	if(iCount==cStr.length)
	{
		System.out.println("Contains only Digit");
	}
	else
	{
		System.out.println("Does not containes only Digit");
	}
}
}
