import java.util.*;
public class maxwidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		String sS[]=new String[iN];
		String MaxWord="";
		int totalLength=0;
		String totalword="";
		for(int i=0;i<iN;i++)
		{
			sS[i]=s.next();
			if(MaxWord.length()<sS[i].length())
			{
				MaxWord=sS[i];
			}
			totalLength+=sS[i].length();
			totalword+=sS[i];
		}
		int maxWidth=s.nextInt();
		int resLength=totalLength/10;
		int length1=totalword.length()/resLength;
		String Res[]=new String[resLength];
		String finalRes[]=new String[resLength];
		for(int i=0;i<resLength;i++)
		{
			Res[i]="";
			finalRes[i]="";
		}
		int k=0;
		System.out.println(totalLength+" "+length1+" "+resLength);
		int i=0;
		while(i<resLength&&k<sS.length)
		{
			int flag;
			if(k==0)
				flag=k;
			else
				flag=k-1;
			while(i<resLength&&k<sS.length)
			{
				if(Res[i].length()+sS[k].length()<=length1){
				Res[i]+=sS[k];
				System.out.println(sS[k]+" "+k+" "+i);
				k++;
				}
				else
				{
					break;
				}
			}
			//System.out.println(k-1);
			if(k<sS.length) {
			if(sS[k].length()>length1)
			{
				Res[i+1]+=sS[k];
				System.out.println(sS[k]+" "+k+" "+i+1);
				k++;
			}}
			//System.out.println(sS[k]+" "+k+" "+i);
			int space=0;
				if(Res[i].length()<maxWidth)
				{
					space+=(maxWidth-Res[i].length());
				}
				System.out.println("i "+k+" "+flag);
			for(int g=flag;g<k-1;g++)
			{
				System.out.println("space"+i+" "+space/(k-1)+" "+space);
				finalRes[i]+=sS[g];
				for(int d=0;d<space/(space/(k-1));d++)
				{
					finalRes[i]+=" ";
				}
			}
			i++;
		}
		for(int j=0;j<resLength;j++)
		{
			System.out.println(Res[j]+" "+finalRes[j]);
		}
	}

}
/*
6
what must be acknowledgement shall be
16
*/