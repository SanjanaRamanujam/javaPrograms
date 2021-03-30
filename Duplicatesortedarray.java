import java.util.*;
public class Duplicatesortedarray {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int iN=s.nextInt();
	int iArr[]=new int[iN];
	for(int i=0;i<iN;i++)
	{
		iArr[i]=s.nextInt();
	}
	Arrays.sort(iArr);
	TreeSet<Integer> ts=new TreeSet<Integer>();
	for(int i=0;i<iN;i++)
	{
		ts.add(iArr[i]);
	}
	Iterator it=ts.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
