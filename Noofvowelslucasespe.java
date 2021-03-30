import java.util.*;
public class Noofvowelslucasespe {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.next();
	char cChar[]=sStr.toCharArray();
	int v=0,u=0,l=0,sp=0;
	for(int i=0;i<cChar.length;i++)
	{
		if(cChar[i]=='a'||cChar[i]=='e'||cChar[i]=='i'||cChar[i]=='o'||cChar[i]=='u'||cChar[i]=='A'||cChar[i]=='E'||cChar[i]=='I'||cChar[i]=='O'||cChar[i]=='U')
		{
			v++;
		}
		if(Character.isUpperCase(cChar[i]))
		{
			u++;
		}
		if(Character.isLowerCase(cChar[i]))
		{
			l++;
		}
		if(!Character.isLetter(cChar[i])&&!Character.isDigit(cChar[i]))
		{
			sp++;
		}
	}
	System.out.println("Vowels : "+v++);
	System.out.println("Lowercase : "+l++);
	System.out.println("Uppercase : "+u++);
	System.out.println("SpecialCharacter : "+sp++);
}
}
