import java.util.*;
public class arraytobinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iArr[]=new int[iN];
		int iSum=0;
		for(int i=0;i<iN;i++)
		{
			iArr[i]=s.nextInt();
			iSum+=iArr[i];
		}
		for(int i=0;i<iN;i++)
		{
			iSum-=iArr[i];
			iArr[i]=iSum;
			System.out.print(iArr[i]+" ");
		}
	}

}
