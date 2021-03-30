import java.util.*;
public class zerosandonesarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iArr[]=new int[iN];
		for(int i=0;i<iN;i++)
		{
			iArr[i]=s.nextInt();
		}
		for(int i=0;i<iN-1;i++)
		{
			if(iArr[i]>iArr[i+1])
			{
				int temp=iArr[i];
				iArr[i]=iArr[i+1];
				iArr[i+1]=temp;
			}
		}
		for(int i=0;i<iN;i++)
		{
			System.out.print(iArr[i]+" ");
		}
	}

}
