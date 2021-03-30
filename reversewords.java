import java.util.Scanner;
public class reversewords {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.nextLine();
	String sWords[]=sStr.split(" ");
	for(int i=0;i<sWords.length;i++)
	{
		String str[]=sWords[i].split("");
		String sRes="";
		for(int j=str.length-1;j>=0;j--)
		{
			sRes+=str[j];
		}
		System.out.print(sRes+" ");
	}
}
}
