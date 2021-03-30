import java.util.Scanner;
public class Series
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iFlag=1;
		for(int i=1;i<iN;i++)
		{
			iFlag*=2;
		}
		System.out.println(iFlag);
	}
}
