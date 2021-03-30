import java.util.*;
public class XSum {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int iN=s.nextInt();
	int iA[]=new int[iN];
	System.out.println("Enter the values");
	for(int i=0;i<iN;i++)
	{
		iA[i]=s.nextInt();
	}
	int iX=s.nextInt();
	int iFlag=0;
	for(int i=0;i<iN;i++)
	{
		for(int j=0;j<iN;j++)
		{
			if(iA[i]+iA[j]==iX)
			{
				iFlag=1;
			}
		}
	}
	if(iFlag==1)
	{
		System.out.println("There Exists 2 elements in Array whose sum is Exactly x");
	}
	else
	{
		System.out.println("There are no 2 elements in Array whose sum is Exactly x");
	}
}
}
