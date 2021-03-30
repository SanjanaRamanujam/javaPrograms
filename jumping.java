import java.util.*;
public class jumping {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int jump=0;
		int iN=s.nextInt();
		int iArr[]=new int[iN];
		for(int i=0;i<iN;i++)
		{
			iArr[i]=s.nextInt();
		}
		if(iArr[iN-1]==1||iArr[0]==1)
		{
			System.out.println("Not Possible");
		}
		else
		{
			int i=0,flag=1;;
			while(i<iN&&flag==1)
			{
				if(iArr[i]!=1)
				{
					jump++;
					i++;
				}
				else if(iArr[i+1]!=1)
				{
					jump++;
					i+=2;
				}
				else
				{
					flag=0;
					i++;
				}
			}
			if(flag==1)
			{
				System.out.println(jump-1);
			}
			else
			{
				System.out.println("Not Possible");
			}
		}
	}
}

