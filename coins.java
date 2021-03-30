import java.util.*;
public class coins {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int iN=s.nextInt();
	int iCoin1=0,iCoin2=0,iCoin5=(iN-5)/5,iAns=0,iRem=0;
	iRem=iN-5*iCoin5;
	if(iRem%2==0)
	{
		iCoin1=2;
	}
	else
	{
		iCoin1=1;
	}
	iAns=iCoin1+iCoin5;
	iAns+=(iRem-iCoin1)/2;
	iCoin2=(iRem-iCoin1)/2;
	System.out.println(iAns);
	System.out.println("Coin1 :"+iCoin1);
	System.out.println("Coin2 :"+iCoin2);
	System.out.println("Coin3 :"+iCoin5);
}
}
