import java.util.*;
public class capitalisethereapeatedletersinstring {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.nextLine();
	int iCount=0;
	for(int i=0;i<sStr.length();i++)
	{
		iCount=0;
		for(int j=0;j<sStr.length();j++)
		{
			if(sStr.charAt(i)==sStr.charAt(j))
			{
				iCount++;
			}
		}
		if(iCount>1)
		{
			System.out.print(Character.toUpperCase(sStr.charAt(i)));
		}
		else
		{
			System.out.print(sStr.charAt(i));
		}
	}
}
}
