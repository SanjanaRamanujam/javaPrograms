import java.util.Scanner;
public class capitalisefirstword {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.nextLine();
	String sWords[]=sStr.split(" ");
	for(int i=0;i<sWords.length;i++)
	{
		char cFlag[]=sWords[i].toCharArray();
		if(Character.isAlphabetic(cFlag[0]))
		{
			cFlag[0]=Character.toUpperCase(cFlag[0]);
		}
		for(int j=0;j<cFlag.length;j++)
			System.out.print(cFlag[j]);
		System.out.print(" ");
	}
	
}
}
