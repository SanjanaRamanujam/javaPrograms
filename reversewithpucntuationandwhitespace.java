import java.util.Scanner;

public class reversewithpucntuationandwhitespace {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sStr=s.nextLine();
		String sStr1[]=sStr.split("");
		String sRev="";
		for(int j=sStr.length()-1;j>=0;j--)
		{
			if(!Character.isWhitespace(sStr1[j].charAt(0))||Character.isLetter(sStr1[j].charAt(0))||Character.isDigit(sStr1[j].charAt(0)))
				sRev+=sStr1[j];
		}
		int m=0;
		for(int i=0;i<sStr.length();i++)
		{
			if(Character.isLetter(sStr.charAt(i))||Character.isDigit(sStr1[i].charAt(0)))
			{
				System.out.print(sRev.charAt(m));
				m++;
			}
			else
			{
				System.out.print(sStr.charAt(i));
			}
		}
	}
}
