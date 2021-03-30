import java.util.*;
public class leaders {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int iN=s.nextInt();
	int iArr[]=new int[iN];
	for(int i=0;i<iN;i++)
	{
		iArr[i]=s.nextInt();
	}
	int iFlag=0;
	for(int i=0;i<iN;i++)
	{
		int j;
		for(j=i+1;j<iN;j++)
		{
			if((iArr[i]<iArr[j]))
			{
				break;
			}
		}
		if(j==iN)
		{
			System.out.print(iArr[i]+" ");
		}
	}
}
}
