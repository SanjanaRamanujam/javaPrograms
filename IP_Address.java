import java.util.*;

import jdk.javadoc.internal.doclets.toolkit.util.ElementListWriter;
public class IP_Address {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String sStr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            sStr[i]=s.nextLine();
            //System.out.println(sStr[i]);
            int flag=1,count=0;
            String temp="";
            for(int j=0;j<sStr[i].length();j++)
            {
                if(sStr[i].charAt(j)=='.')
                {
                    count++;
                    if(flag==1&&Integer.parseInt(temp)>=0&&Integer.parseInt(temp)<256)
                    {
                        temp="";
                    }
                    else{
                        flag=0;
                        temp="";
                    }
                }
                else
                {
                    if(Character.isDigit(sStr[i].charAt(j)))
                        temp+=(String.valueOf(sStr[i].charAt(j)));
                    else
                        flag=0;
                }
            }
            if(flag==1&&count==3)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}
