import java.util.Scanner;
public class longestwordinsentence {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.nextLine();
	String sWords[]=sStr.split(" ");
	String sMaxLength="";
	int iMax=Integer.MIN_VALUE;
	for(int i=0;i<sWords.length;i++)
	{
		if(sWords[i].length()>iMax)
		{
			sMaxLength=sWords[i];
			iMax=sWords[i].length();
		}
	}
	for(int i=0;i<sWords.length;i++)
	{
		if(iMax==sWords[i].length()&&sWords[i]!=sMaxLength)
		{
			System.out.println(sWords[i]);
		}
	}
	System.out.println(sMaxLength);
}
}
