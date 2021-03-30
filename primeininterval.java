import java.util.*;
public class primeininterval {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iStart=s.nextInt();
		int iEnd=s.nextInt();
		int iCount=0;
		for(int i=iStart;i<=iEnd;i++)
		{
			iCount=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					iCount=1;
				}
//				else
//				{
//					iCount=0;
//				}
			}
			if(iCount!=1)
			{
				System.out.print(i+" ");
			}
		}
	}

}
