import java.util.*;
public class ascendingorderoflength {
	public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sString=s.nextLine();
	String sStr[]=sString.split(" ");
	ArrayList<String> al=new ArrayList<String>();
	for(int i=0;i<sStr.length;i++)
	{
		if(!al.contains(sStr[i]))
		{
			al.add(sStr[i]);
		}
	}
	int iLen[]=new int[al.size()];
	int k=0;
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		String str=it.next().toString();
		//System.out.println(str);
		iLen[k]=str.length();
		k++;
	}
	Arrays.sort(iLen);
	ArrayList<String> al1=new ArrayList<String>();
	for(int i=0;i<iLen.length;i++)
	{
		for(String str:al)
		{
			if(str.length()==iLen[i])
			{
				if(!al1.contains(str))
				{
					System.out.println(str+" ");
					al1.add(str);
				}
			}
		}
	}
}
}
