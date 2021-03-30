import java.util.*;
public class Question3collections
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		ArrayList<String> al=new ArrayList<String>(iN);
		for(int i=0;i<iN;i++)
		{
			al.add(s.next());
		}
		ArrayList<String> flag=new ArrayList<String>(1);
		flag.add("****");
		for(int i=0;i<iN;i++)
		{
			if(al.get(i).length()==4)
			{
				al.addAll(i,flag);
				i++;
			}
		}
		System.out.println(al);
	}
}