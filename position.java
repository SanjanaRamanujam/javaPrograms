import java.util.*;
public class position {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int iN=s.nextInt();
	int iArr[]=new int[iN];
	for(int i=0;i<iN;i++)
	{
		iArr[i]=s.nextInt();
	}
	int iX=s.nextInt();
	int iFlag=0;
	for(int i=0;i<iN;i++)
	{
		if(iX==iArr[i])
		{
			System.out.println(i+1);
			iFlag=1;
		}
	}
	if(iFlag==0)
		System.out.println("Not Found");
}
}
