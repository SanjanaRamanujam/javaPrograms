import java.util.*;
public class Jogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int iR=s.nextInt();
		int iD1=s.nextInt();
		int iD2=s.nextInt();
		int iD3=s.nextInt();
		int iStart[]=new int[4];
		for(int i=0;i<4;i++)
		{
			iStart[i]=s.nextInt();
		}
		int iSpeed[]=new int[4];
		for(int i=0;i<4;i++)
		{
			iSpeed[i]=s.nextInt();
		}
		int iWise[]=new int[4];
		for(int i=0;i<4;i++)
		{
			iWise[i]=s.nextInt();
		}
		int iSec=s.nextInt();
//		TreeMap<Integer,Integer> center=new TreeMap<Integer,Integer>();
////		center.put(0,0);
////		center.put(0,0+iD1+iR);
////		center.put(0,0+iD2+iR);
////		center.put(0,0+iD3+iR);
		HashMap<Integer,Integer> coordinates=new HashMap<Integer,Integer>();
		for(int i=0;i<4;i++)
		{
			if(i==0)
			{
				int x=0;
				int y=0;
				coordinates.put(x, y);
			}
			if(i==1)
			{
				int x=iD1;
				int y=0;
				coordinates.put(x,y);
			}
		}
		
	}

}
