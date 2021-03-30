import java.util.*;
public class sumofasciicharinstring {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr[]=s.next().split("");
	int ascii=0;
	for(int i=0;i<sStr.length;i++)
	{
		ascii+=sStr[i].charAt(0);
	}
	System.out.println(ascii);
}
}
