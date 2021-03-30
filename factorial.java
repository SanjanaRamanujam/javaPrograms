import java.util.*;
import java.math.BigInteger;
public class factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int lN=s.nextInt();
		if(lN<0)
		{
			System.out.println("Factirial connot be found for numbers less than 0");
		}
		else if(lN==0)
		{
			System.out.println("Factorial of 0 is 0");
		}
		else
		{
			BigInteger fact=new BigInteger("1");
			for(long i=1;i<=lN;i++)
			{
				fact=fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
		}
	}

}
