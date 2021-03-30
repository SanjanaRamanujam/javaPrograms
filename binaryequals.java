import java.util.*;
import java.lang.*;
public class binaryequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iArr[]=new int[iN];
		for(int i=0;i<iN;i++)
		{
			iArr[i]=s.nextInt();
		}
		Arrays.sort(iArr);
		int max=iArr[iN-1];
		String sMax=Integer.toBinaryString(max);
		//System.out.println(sMax.length());
		//ArrayList<Integer> al=new ArrayList<Integer>();
		String iBinary[]=new String[iN];
		int k=0;
		for(int i=0;i<iN;i++)
		{
			String binary=Integer.toBinaryString(iArr[i]);
			if(binary.length()<sMax.length())
			{
				//System.out.println(sMax.length()-binary.length());
				for(int j=0;j<(sMax.length()-binary.length()+1);j++)
				{
					binary="0"+binary;
				}
			}
			iBinary[k]=binary;
			System.out.print(iBinary[k]+" ");
			k++;
		}
		System.out.println();
		int iFlag=0;
		int iCount=0;
		for(int i=0;i<iN;i++)
		{
			iFlag=0;
			for(int j=i;j<iN;j++)
			{
				if(Integer.bitCount(Integer.parseInt(iBinary[i]))!=Integer.bitCount(Integer.parseInt(iBinary[j])))
				{
					iFlag=1;
				}
			}
			if(iFlag!=1)
			{
				iCount++;
			}
		}
		String sRes=String.valueOf(Integer.toBinaryString(iCount));
		System.out.println(sMax.length()-sRes.length());
		for(int j=1;j<=(sMax.length()-sRes.length()+3);j++)
		{
			sRes="0"+sRes;
			System.out.println(sRes+j);
		}
		System.out.println("The Binary equals is:"+sRes);
	}

}
