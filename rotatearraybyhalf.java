import java.util.*;
public class rotatearraybyhalf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iArr[]=new int[iN];
		for(int i=0;i<iN;i++)
		{
			iArr[i]=s.nextInt();
		}
		if(iN%2==0)
		{
			for(int i=0;i<iN/2;i++)
			{
				int temp=iArr[i];
				iArr[i]=iArr[i+iN/2];
				iArr[i+iN/2]=temp;
			}
		}
		else
		{
			for(int i=0;i<iN/2;i++)//1 2 3 4 5
			{
				int temp=iArr[i];
				iArr[i]=iArr[iN/2+i+1];
				iArr[iN/2+i+1]=temp;
			}
		}
		for(int i=0;i<iN;i++)
		{
			System.out.print(iArr[i]+" ");
		}
	}

}
