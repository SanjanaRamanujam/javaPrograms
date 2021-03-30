import java.util.*;
public class genericroot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iSum=0;
		while(iN>9)
		{
			iSum=0;
			while(iN>0)
			{
				iSum+=iN%10;
				iN/=10;
			}
			iN=iSum;
		}
		System.out.println(iN);
	}

}
