import java.util.*;
public class table {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N");
		int iN=s.nextInt();
		System.out.println("Enter the Multiplier");
		int iM=s.nextInt();
		for(int i=iM;i>0;i--)
		{
			System.out.println(i+"*"+iM+"="+iM*i);
		}
	}
}
