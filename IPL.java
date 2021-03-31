import java.util.*;
public class IPL {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sStr[]=s.next().split("");
        String a1=sStr[0];
        String a2=sStr[1];
        int flag=1;
        for(int i=2;i<sStr.length;i++)
        {
            if(i%2==0)
            {
                if(sStr[i].equals(a1))
                {
                    continue;
                }
                else{
                    flag=0;
                }
            }
            else{
                if(sStr[i].equals(a2))
                {
                    continue;
                }
                else{
                    flag=0;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
