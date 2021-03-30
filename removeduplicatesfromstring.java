import java.util.*;
public class removeduplicatesfromstring {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String sStr[]=s.nextLine().split("");
			ArrayList <String> al=new ArrayList<String>();
			String sRes="";
			for(int i=sStr.length-1;i>=0;i--)
			{
				if(!Character.isWhitespace(sStr[i].charAt(0))) {
				if(!al.contains(sStr[i]))
				{
					al.add(sStr[i]);
					//System.out.print(sStr[i]);
					sRes+=sStr[i];
				}
				}
				else
				{
					//System.out.print(sStr[i]);
					sRes+=sStr[i];
				}
			}
			for(int i=sRes.length()-1;i>=0;i--)
			{
				System.out.print(sRes.charAt(i));
			}
		}

	}
