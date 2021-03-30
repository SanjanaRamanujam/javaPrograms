import java.util.*;
public class secondarydiagonalsum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iM=s.nextInt();
		int iArr[][]=new int[iN][iM];
		int iSum=0;
		for(int i=0;i<iN;i++)
		{
			for(int j=0;j<iM;j++)
			{
				iArr[i][j]=s.nextInt();
				if(i+j==iN-1)
				{
					iSum+=iArr[i][j];
				}
			}
		}
		System.out.print(iSum);
	}

}
