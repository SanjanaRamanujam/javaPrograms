import java.util.Scanner;
public class a4b3c2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sStr=s.next();
		char cStr[]=new char[sStr.length()/2];
		int iStr[]=new int[sStr.length()/2];
		int j=0,k=0;
		for(int i=0;i<sStr.length();i++)
		{
			if(Character.isAlphabetic(sStr.charAt(i)))
			{
				cStr[j]=sStr.charAt(i);
				//System.out.println(cStr[j]);
				j++;
			}
			if(Character.isDigit(sStr.charAt(i)))
			{
				iStr[k]=(int)(sStr.charAt(i))-48;
				//System.out.println(iStr[k]);
				k++;
			}
		}
		int h=0;
		for(int i=0;i<iStr.length;i++)
		{
			for(int e=0;e<iStr[i];e++)
			{
				System.out.print(cStr[h]);
			}
			h++;
		}
	}

}
