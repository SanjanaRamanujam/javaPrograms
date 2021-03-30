import java.util.*;
public class Divisors {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int iN=s.nextInt();
	for(int i=1;i<=iN/2;i++)
	{
		if(iN%i==0)
		{
			System.out.print(i+" ");
		}
	}
	System.out.print(iN);
}
}
