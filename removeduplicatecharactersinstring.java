import java.util.*;
public class removeduplicatecharactersinstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sStr[]=s.nextLine().split("");
		ArrayList <String> al=new ArrayList<String>();
		for(int i=0;i<sStr.length;i++)
		{
			if(!Character.isWhitespace(sStr[i].charAt(0))) {
			if(!al.contains(sStr[i]))
			{
				al.add(sStr[i]);
				System.out.print(sStr[i]);
			}
			}
			else
			{
				System.out.print(sStr[i]);
			}
		}
	}

}
