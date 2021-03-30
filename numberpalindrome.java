import java.util.*;
public class numberpalindrome {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		String sStr=Integer.toString(iN);
		char sFor[]=sStr.toCharArray();
		int iLen=sFor.length;
		int iFlag=0;
		for(int i=iLen-1,j=0;i>=0&&j<iLen;i--,j++)
		{
			if(sFor[j]!=sFor[i])
			{
				iFlag=1;
			}
		}
		if(iFlag==0)
			System.out.println("It is Palindrome");
		else
			System.out.println("It is not a Palindrome");
	}
}
