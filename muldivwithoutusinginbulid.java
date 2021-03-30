import java.util.*;
public class muldivwithoutusinginbulid {
	public void multiply(int iA,int iB)
	{
		int iAns=0;
		for(int i=0;i<iA;i++)
		{
			iAns+=iB;
		}
		System.out.println("Multiplication of 2 numbers is "+iAns);
	}
	public void divide(int iA,int iB)
	{
		int iAns=0;
		if(iA<iB) {
		while(iB>0)
		{
			iB-=iA;
			iAns++;
		}
		}
		else
		{
			while(iA>0)
			{
				iA-=iB;
				iAns++;
			}
		}
		System.out.println("Division of 2 numbers is "+iAns);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		muldivwithoutusinginbulid obj=new muldivwithoutusinginbulid();
		int iA=s.nextInt();
		int iB=s.nextInt();
		obj.multiply(iA,iB);
		obj.divide(iA,iB);
	}

}
