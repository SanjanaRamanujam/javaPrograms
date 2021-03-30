import java.util.ArrayList;
import java.util.Scanner;

public class collection1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		ArrayList<ArrayList> all=new ArrayList<ArrayList>();
		for(int i=0;i<iN;i++)
		{
			int iNum = sc.nextInt();
            ArrayList<Integer> al1 =  new ArrayList<Integer>();
            for(int j=0;j<iNum;j++){
                al1.add(sc.nextInt());
            }
            all.add(al1);
		}
	}

}
