import java.util.*;
public class goodorbadstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sStr[]=s.next().split("");
		int iCountv=0,iCountc=0;
		for(int i=0;i<sStr.length;i++)
		{
			if(sStr[i]=="a"||sStr[i]=="e"||sStr[i]=="i"||sStr[i]=="o"||sStr[i]=="u"||iCountv<5)
					iCountv++;
			else
				break;
			if(!(sStr[i]=="a"||sStr[i]=="e"||sStr[i]=="i"||sStr[i]=="o"||sStr[i]=="u")||iCountc<3)
				iCountc++;
		else
			break;
		}
		if(iCountv>=5)
		{
			System.out.println("Bad String");
		}
		else if(iCountc>=3)
		{
			System.out.println("Bad String");
		}
		else
		{
			System.out.println("Good String");
		}
	}

}
