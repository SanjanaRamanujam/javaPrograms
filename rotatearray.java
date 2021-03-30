import java.util.*;
public class rotatearray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iArr[]=new int[iN];
		for(int i=0;i<iN;i++)
		{
			iArr[i]=s.nextInt();
		}
		int iRot=s.nextInt();
		int iFlag=0;
		while(iRot>0) {
			iFlag=iArr[0];
			for(int i=1;i<iN;i++)
			{
					iArr[i-1]=iArr[i];
			}
			iArr[iN-1]=iFlag;
			iRot-=1;
		}
		for(int i=0;i<iN;i++)
		{
			System.out.print(iArr[i]+" ");
		}
	}
}
