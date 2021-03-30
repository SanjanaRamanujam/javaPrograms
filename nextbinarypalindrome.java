import java.util.*;
public class nextbinarypalindrome {
	public static boolean isPalindrome(String sBin)
	{
		String sRev="";
		for(int j=sBin.length()-1;j>=0;j--)
		{
			sRev+=String.valueOf(sBin.charAt(j));
		}
		if(sBin.equals(sRev))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int iN=s.nextInt();
		int flag=iN+1;
		int wh=1;
		while(wh==1)
		{
			String sBin=Integer.toBinaryString(flag);
			if(isPalindrome(sBin))
			{
				wh=0;
				System.out.println("Binary Palindrome is :"+sBin);
				System.out.println("Decimal Number is "+(flag));
			}
			flag+=1;
		}
	}
}
