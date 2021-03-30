import java.util.*;
public class Question1collections 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		ArrayList<ArrayList<Integer>> all=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<iN;i++)
		{
			int iNum = sc.nextInt();
            ArrayList<Integer> flag=  new ArrayList<Integer>();
            for(int j=0;j<iNum;j++)
            {
                flag.add(sc.nextInt());
            }
            all.add(flag);
		}
		int iQ=sc.nextInt();
		ArrayList<String> res=new ArrayList<String>();
		for(int i=0;i<iQ;i++)
		{
            int iX =sc.nextInt();
            int iY=sc.nextInt();
            if(iX-1<all.size() && iY-1<all.get(iX-1).size())
            {
            	res.add(String.valueOf(all.get(iX-1).get(iY-1)));
                //System.out.println(all.get(iX-1).get(iY-1));
            }
            else
            {
            	res.add("Error!");
                   // System.out.println("ERROR!");
             }
        }
		Iterator it=res.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
