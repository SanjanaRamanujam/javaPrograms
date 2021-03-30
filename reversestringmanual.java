import java.util.*;
public class reversestringmanual {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.next();
	String sStr1[]=sStr.split("");
	String sRes="";
	for(int j=sStr.length()-1;j>=0;j--)
	{
		sRes+=sStr1[j];
	}
	System.out.println(sRes);
}
}
