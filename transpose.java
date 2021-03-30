import java.util.*;
public class transpose {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int iN=s.nextInt();
	int iArr[][]=new int[iN][iN];
	int iTrans[][]=new int[iN][iN];
	for(int i=0;i<iN;i++)
	{
		for(int j=0;j<iN;j++)
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
	for(int i=0;i<iN;i++)
	{
		for(int j=0;j<iN;j++)
		{
			System.out.print(iTrans[i][j]+" ");
		}
		System.out.println();
	}
}
}
