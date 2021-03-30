import java.util.Scanner;
public class aaabbccaa {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.next();
	String sChar[]=sStr.split("");
	int iCount=0;
	for(int i=0;i<sChar.length;i++)
	{
		iCount=0;
		for(int j=i;j<sChar.length;j++)
		{
			if(sChar[i].equals(sChar[j]))
			{
				iCount++;
			}
			else
			{
				break;
			}
		}
		if(i!=0) {
		if(!sChar[i-1].equals(sChar[i]))
			System.out.print(sChar[i]+iCount+" ");
		}
		else if(i==0)
		System.out.print(sChar[i]+iCount+" ");
	}
}
}
