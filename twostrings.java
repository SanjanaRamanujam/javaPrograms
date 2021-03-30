import java.util.Scanner;
public class twostrings {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr1=s.next();
	String sStr2=s.next();
	char sStr3[]=new char[sStr1.length()+sStr2.length()];
	int k=0;
	for(int i=0;i<sStr1.length();i++)
	{
		sStr3[k]=sStr1.charAt(i);
		k++;
	}
	for(int i=0;i<sStr2.length();i++)
	{
		sStr3[k]=sStr2.charAt(i);
		k++;
	}
	for(int i=0;i<sStr3.length;i++)
	{
		System.out.print(sStr3[i]);
	}
}
}
