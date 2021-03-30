import java.util.*;
public class identitymatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iArr[][]=new int[iN][iN];
		for(int i=0;i<iN;i++)
		{
			for(int j=0;j<iN;j++)
			{
				iArr[i][j]=s.nextInt();
			}
		}
		int iCountd=0,iCountr=0;
		for(int i=0;i<iN;i++)
		{
			for(int j=0;j<iN;j++)
			{
				if(i==j)
				{
					if(iArr[i][j]==1)
					{
						iCountd++;
					}
				}
				else
				{
					if(iArr[i][j]==0)
					{
						iCountr++;
					}
				}
			}
		}
		System.out.println(iCountd+" "+iCountr);
		if(iCountd==iN&&iCountr==(iN*iN)-iN)
		{
			System.out.println("Identity Matrix");
		}
		else
		{
			System.out.println("Not Identity Matrix");
		}
	}

}
