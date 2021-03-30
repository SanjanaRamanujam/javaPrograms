import java.util.Scanner;
public class extraspaces {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.nextLine();
	String sSpace[]=sStr.split(" ");
	for(int i=0;i<sSpace.length;i++)
	{
		sSpace[i]=sSpace[i].trim();
			for(int k=0;k<sSpace[i].length();k++)
			{
				if(!Character.isWhitespace(sSpace[i].charAt(k)))
				{
					System.out.print(sSpace[i].charAt(k));
				}
				if(k==sSpace[i].length()-1)
				{
					System.out.print(" ");
				}
			}
	}
}
}
