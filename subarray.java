import java.util.*;
public class subarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iArr[]=new int[iN];
		for(int i=0;i<iN;i++)
		{
			iArr[i]=s.nextInt();
		}
		int iCount=0;
		for(int i=0;i<iN;i++)
		{
			iCount=2;
			while(iCount>0&&iCount<=iN)
			{
				for(int j=i;j<iCount&&i+1!=iCount;j++)
				{
					System.out.print(iArr[j]+" ");
				}
				iCount++;
				System.out.println();
			}
		}
	}

}
