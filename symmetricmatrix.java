import java.util.*;
public class symmetricmatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iM=s.nextInt();
		int iArr[][]=new int[iN][iM];
		int iTrans[][]=new int[iN][iM];
		int iSum=0;
		for(int i=0;i<iN;i++)
		{
			for(int j=0;j<iM;j++)
			{
				iArr[i][j]=s.nextInt();
			}
		}
		int k=0,l=0;
		for(int i=iN-1;i>=0&&k<iN;i--)
		{
			l=0;
			for(int j=iN-1;j>=0&&l<iN;j--)
			{
				iTrans[i][j]=iArr[k][l];
				l++;
			}
			k++;
		}
		int iCount=0;
		for(int i=0;i<iN;i++)
		{
			for(int j=0;j<iN;j++)
			{
				//System.out.println(iTrans[i][j]);
				if(iTrans[i][j]==iArr[i][j])
				{
					iCount++;
				}
			}
		}
		if(iCount==iN*iM)
		{
			System.out.println("Symmetric");
		}
		else
		{
			System.out.println("Non Symmetric");
		}
	}
}
