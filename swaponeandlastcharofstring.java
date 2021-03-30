import java.util.*;
public class swaponeandlastcharofstring {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String sStr=s.nextLine();
	String sWords[]=sStr.split(" ");
	String sRes="";
	for(int i=0;i<sWords.length;i++)
	{
		String temp=sWords[i];
		String temp1[]=temp.split("");
		String flag=temp1[0];
		temp1[0]=temp1[temp1.length-1];
		temp1[temp1.length-1]=flag;
		for(int j=0;j<temp1.length;j++)
		{
			sRes+=temp1[j];
		}
		sRes+=" ";
	}
	System.out.println(sRes);
	}

}
