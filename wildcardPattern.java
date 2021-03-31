import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class wildcardPattern {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1[]=s.next().split("");
        String s2[]=s.next().split("");
        int flag=1;
        if(s1.length==s2.length)
        {
            for(int i=0;i<s1.length;i++)
            {
                if(s1[i].equals(s2[i]))
                {
                    continue;
                }
                else if(s1[i].equals("?"))
                {
                    if(s2[i].equals("?"))
                    {
                        continue;
                    }
                    else if(Character.isAlphabetic(s2[i].charAt(0)))
                    {
                        continue;
                    }
                    else{
                        flag=0;
                    }
                }
                else if(Character.isAlphabetic(s1[i].charAt(0)))
                {
                    if(s2[i].equals("?"))
                    {
                        continue;
                    }
                    else{
                        flag=0;
                    }
                }
                else{
                    flag=0;
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
}
