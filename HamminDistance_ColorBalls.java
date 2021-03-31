import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class HamminDistance_ColorBalls {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1[]=s.next().split("");
        String s2[]=s.next().split("");
        String z[]=new String[s1.length];
        String w="W";
        String b="B";
        int count=0;
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].equals(s2[i]))
            {
                if(s1[i].equals(w))
                {
                    z[i]=b;
                }
                else if(s1[i].equals(b))
                {
                    z[i]=w;
                }
            }
                else
                {
                    if(count%2==0)
                    {
                        z[i]=s1[i];
                    }
                    else
                    {
                        z[i]=s2[i];
                    }
                    count++;
                }
        }
        for(int i=0;i<z.length;i++)
        {
            System.out.print(z[i]);
        }
    }
}
