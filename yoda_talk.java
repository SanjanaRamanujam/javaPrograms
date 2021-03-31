import java.util.*;
public class yoda_talk {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sStr[]=s.nextLine().split(" ");
        String sRes="";
        for(int i=2;i<sStr.length;i++)
        {
            sRes+=sStr[i]+" ";
        }
        sRes+=sStr[0]+" ";
        sRes+=sStr[1];
        System.out.println(sRes);
    }
    
}
