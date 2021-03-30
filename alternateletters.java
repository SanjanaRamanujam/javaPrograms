import java.util.Scanner;
public class alternateletters {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.next();
	for(int i=0;i<sStr.length();i+=2)
	{
		System.out.print(sStr.charAt(i));
	}
}
}
