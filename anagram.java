import java.util.*;
public class anagram {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr1=s.next();
	String sStr2=s.next();
	String sArr1[]=sStr1.split("");
	String sArr2[]=sStr2.split("");
	Arrays.sort(sArr1);
	Arrays.sort(sArr2);
	int iFlag=0;
	if(sArr1.length==sArr2.length)
	{
		for(int i=0;i<sArr1.length;i++)
		{
			if(sArr1[i].equals(sArr2[i]))
			{
				iFlag++;
			}
		}
	}
	if(iFlag==sArr1.length)
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not Anagram");
	}
}
}
