import java.util.*;
public class stringfinding {
    static String res="";
    public static void find(int g,int h,ArrayList<String> words,String sStr)
    {
        int noofwords=words.size();
        for(int i=g;i<words.get(0).length();i++)
        {
            int j=0;
            while(j<noofwords&&j!=h)
            {
                int flag=0;
                for(int k=0;k<words.get(j).length();k++)
                {
                    if((sStr.charAt(i))==(words.get(j).charAt(j)))
                    {
                        //flag=1;
                        continue;
                    }
                    else
                    {
                        flag=1;
                        j++;
                    }
                }
                if(flag!=1&&res.length()!=(words.get(0).length()*noofwords))
                {
                    find(i,j,words,sStr);
                    res+=words.get(j);
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sStr=s.next();
        int noofwords=s.nextInt();
        //String words[]=new String[noofwords];
        ArrayList<String>words=new ArrayList();
        for(int i=0;i<noofwords;i++)
        {
            words.add(s.next());
        }
        find(0,0,words,sStr);
        System.out.println(res);
    }
}
