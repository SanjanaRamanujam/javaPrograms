import java.util.*;
public class replacewithcharexceptfirstchar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sStr=s.nextLine();
		char cChar=s.next().charAt(0);
		String sStr1=sStr.substring(1,sStr.length());
		String ss=String.valueOf(cChar);
		sStr1=sStr1.replace(ss, "$");
		System.out.print(sStr.charAt(0)+sStr1);
	}

}
