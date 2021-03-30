import java.util.*;
public class commoncharinstrings {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr1[]=s.next().split("");
	String sStr2[]=s.next().split("");
	ArrayList<String> al=new ArrayList<String>();
	for(int i=0;i<sStr1.length;i++)
	{
		for(int j=0;j<sStr2.length;j++)
		{
			if(sStr1[i].equals(sStr2[j]))
			{
				if(!al.contains(sStr1[i]))
				al.add(sStr1[i]);
			}
		}
	}
	String common[]=new String[al.size()];
	common=al.toArray(common);
	Arrays.sort(common);
	for(int i=0;i<common.length;i++)
	{
		System.out.println(common[i]);
	}
}
}
