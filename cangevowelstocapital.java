import java.util.*;
import java.lang.*;
public class cangevowelstocapital {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.nextLine();
	char cStr[]=sStr.toCharArray();
	for(int i=0;i<cStr.length;i++)
	{
		if(cStr[i]=='a'||cStr[i]=='e'||cStr[i]=='i'||cStr[i]=='o'||cStr[i]=='u')
		{
			cStr[i]=Character.toUpperCase(cStr[i]);
		}
		System.out.print(cStr[i]);
	}
}
}