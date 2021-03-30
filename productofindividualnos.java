import java.util.*;
public class productofindividualnos {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int iN=s.nextInt();
		int iSum=1;
		while(iN>0)
		{
			iSum*=iN%10;
			iN/=10;
		}
		System.out.println(iSum);
	}

}
