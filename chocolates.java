import java.util.*;
public class chocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iArr[]=new int[iN];
		for(int i=0;i<iN;i++)
		{
			iArr[i]=s.nextInt();
		}
		for(int i=0;i<iN-1;i++)
		{
			if(iArr[i]<iArr[i+1])
			{
				System.out.print("1 ");
			}
			else
			{
				System.out.print("2 ");
			}
		}
	}

}
