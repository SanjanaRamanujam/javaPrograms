import java.util.*;
public class sumofarray {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		if(iN<=0)
		{
			System.out.println("Array size cannot be less than 0");
		}
		else
		{
			long iArr[]=new long[iN];
			long iSum=0;
			for(int i=0;i<iN;i++)
			{
				iArr[i]=s.nextLong();
				if(iArr[i]%2==0)
					iSum+=iArr[i];
			}
			System.out.println(iSum);
		}
	}

}
