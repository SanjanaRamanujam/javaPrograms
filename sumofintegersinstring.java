import java.util.*;
public class sumofintegersinstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sStr[]=s.next().split("");
		int iSum=0;
		for(int i=0;i<sStr.length;i++)
		{
			if(Character.isDigit(sStr[i].charAt(0)))
			{
				iSum+=Integer.parseInt(sStr[i]);
			}
		}
		System.out.println(iSum);
	}

}
