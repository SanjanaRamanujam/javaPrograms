import java.util.*;
public class substring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sWord=s.next();
		int iCount=0;
		for(int i=0;i<sWord.length();i++)
		{
			iCount=2;
			while(iCount>0&&iCount<=sWord.length())
			{
				for(int j=i;j<iCount&&i+1!=iCount;j++)
				{
					System.out.print(sWord.charAt(j)+" ");
				}
				iCount++;
				System.out.println();
			}
		}
	}

}
