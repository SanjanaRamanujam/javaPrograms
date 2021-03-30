import java.util.*;
public class reversewithoutno {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.next();
	String sStr1[]=sStr.split("");
	String sRev="";
	for(int j=sStr.length()-1;j>=0;j--)
	{
		if(!Character.isDigit(sStr1[j].charAt(0)))
			sRev+=sStr1[j];
	}
	int m=0;
	for(int i=0;i<sStr.length();i++)
	{
		if(Character.isLetter(sStr.charAt(i)))
		{
			System.out.print(sRev.charAt(m));
			m++;
		}
		else
		{
			System.out.print(sStr.charAt(i));
		}
	}
}
}
