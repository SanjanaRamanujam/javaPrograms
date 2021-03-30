import java.util.*;
public class removespec {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.next();
	char cStr[]=sStr.toCharArray();
	for(int i=0;i<cStr.length;i++)
	{
		if(Character.isDigit(cStr[i])||Character.isLetter(cStr[i]))
		{
			System.out.print(cStr[i]);
		}
	}
}
}
