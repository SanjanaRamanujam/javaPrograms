import java.util.*;
public class sortedorder {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	TreeSet<Integer> ts=new TreeSet<Integer>();
	ts.add(3);
	ts.add(24);
	ts.add(7);
	ts.add(8);
	ts.add(18);
	int iK=s.nextInt();
	ts.add(iK);
	Iterator it=ts.iterator();
	while(it.hasNext())
	{
		System.out.print(it.next()+" ");
	}
}
}
