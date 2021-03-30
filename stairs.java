import java.util.*;
public class stairs {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int f1=1;
	int f2=1;
	int temp=0;
	int iCount=s.nextInt();
	for(int i=2;i<=iCount;i++)
	{
		temp=f1+f2;
		f1=f2;
		f2=temp;
	}
	System.out.println(temp);
}
}
