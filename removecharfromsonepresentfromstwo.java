import java.util.*;
public class removecharfromsonepresentfromstwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sStr1=s.next();
		String sStr2[]=s.next().split("");
		for(int i=0;i<sStr2.length;i++)
		{
			sStr1=sStr1.replace(sStr2[i], "");
		}
		System.out.println(sStr1);
	}

}
