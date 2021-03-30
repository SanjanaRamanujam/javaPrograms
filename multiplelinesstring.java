import java.util.*;
public class multiplelinesstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		s.nextLine();
		String sStr="";
		for(int i=0;i<iN;i++)
		{
			sStr+=s.nextLine()+" ";
		}
		System.out.println(sStr);
	}
}
