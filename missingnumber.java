import java.util.*;
public class missingnumber {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int iN=s.nextInt();
	int iC[]= new int[iN-1];
	int iSum=0;
	System.out.println("Enter the numbers");
	for(int i=0;i<iN-1;i++)
	{
		iC[i]=s.nextInt();
		iSum+=iC[i];
	}
	int iMissingNumber=(iN*(iN+1)/2)-iSum;
	System.out.println(iMissingNumber);
}
}
