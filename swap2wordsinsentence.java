import java.util.*;
public class swap2wordsinsentence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sStr=s.nextLine();
		String sWords[]=sStr.split(" ");
		String sRes=sWords[1]+" "+sWords[0];
		System.out.println(sRes);
	}

}
