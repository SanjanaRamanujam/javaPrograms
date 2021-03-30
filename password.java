import java.util.*;
import java.lang.*;
public class password {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.nextLine();
	int iFlag=0,iFlag1=0,iFlag2=0,iFlag3=0;
	if(sStr.length()>=8&&sStr.length()<=10)
	{
		iFlag=1;
	}
	for(int i=0;i<sStr.length();i++) {
	if(!(Character.isAlphabetic(sStr.charAt(i))||Character.isDigit(sStr.charAt(i))))
	{
		iFlag1=1;
	}
	if(sStr.charAt(i)>=65&&sStr.charAt(i)<=90) {
		iFlag2=1;
	}
	if(sStr.charAt(i)>=48&&sStr.charAt(i)<57)
	{
		iFlag3=1;
	}
	}
	if(iFlag==1&&iFlag1==0&&iFlag==1&&iFlag==1)
	{
		System.out.println("Password Correct");
	}
	else
	{
		System.out.println("Password InCorrect");
	}
}
}
