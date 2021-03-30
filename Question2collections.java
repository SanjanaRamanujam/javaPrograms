import java.util.*;
public class Question2collections {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<iN;i++)
		{
			al.add(s.next());
		}
		if(iN%2==0)
		{
			for(int i=0;i<iN-1;i+=2)
			{
				String flag=al.get(i);
				al.set(i, al.get(i+1));
				al.set(i+1,flag);
			}
		}
		else
		{
			for(int i=0;i<iN-2;i+=2)
			{
				String flag=al.get(i);
				al.set(i, al.get(i+1));
				al.set(i+1,flag);
			}
		}
			System.out.println(al);
	}

}
