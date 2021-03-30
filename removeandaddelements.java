import java.util.*;
public class removeandaddelements {
	static ArrayList<Integer> al=new ArrayList<Integer>();
	static int iOperations=0;
	public static void addFunction(int iFlag)
	{
		if(al.size()==0)
		{
			al.add(iFlag);
			iOperations+=1;
		}
		else
		{
			int flag=0;
			int Min=0,Min1=0,index=0,index1=0;
			for(int i=0;i<al.size();i++)
			{
				if(flag==0)
				{
					Min+=1;
					if(al.get(i)>iFlag)
					{
						index=i;
						flag=1;
						Min+=1;
					}
					Min+=1;
				}
			}
			int flag1=0;
			for(int j=al.size()-1;j>=0;j--)
			{
				if(flag1==0)
				{
					Min1+=1;
					if(al.get(j)<iFlag)
					{
						Min1=j;
						flag1=1;
						Min1+=1;
					}
					Min1+=1;
				}
			}
			if(Min<Min1)
			{
				iOperations+=Min;
				al.add(index,iFlag);
			}
			else
			{
				iOperations+=Min1;
				al.add(index1,iFlag);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		for(int i=0;i<iN;i++)
		{
			int iFlag=s.nextInt();
			addFunction(iFlag);
		}
		System.out.println("Number of operations: "+iOperations);
	}

}
//5
//10
//3
//1
//2
//3
//[1, 2, 3, 3, 10]
//11
