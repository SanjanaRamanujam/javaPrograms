import java.util.*;
public class freqchar {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.next();
	String cArr[]=sStr.split("");
	ArrayList <String> al=new ArrayList<String>();
	ArrayList <String> al2=new ArrayList<String>();
	ArrayList <Integer> al3=new ArrayList<Integer>();
	for(int i=0;i<cArr.length;i++)
	{
		al.add(cArr[i]);
	}
	Integer flag=0;
	for(int h=0;h<al.size();h++)
	{
		if(!al2.contains(cArr[h]))
		{
			al2.add(cArr[h]);
			System.out.println(cArr[h]+" = "+Collections.frequency(al,cArr[h]));
			al3.add(Collections.frequency(al,cArr[h]));
		}
	}
	Integer freq[]=new Integer[al3.size()];
	freq=al3.toArray(freq);
	Arrays.sort(freq);
	System.out.println("Second most frequent character");
	for(int h=0;h<al2.size();h++)
	{
		flag=Collections.frequency(al,cArr[h]);
		if(flag==freq[freq.length-2])
		{
			System.out.println(cArr[h]);
		}
	}
}
}
