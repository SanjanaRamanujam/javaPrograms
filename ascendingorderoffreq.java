import java.util.*;
public class ascendingorderoffreq {
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new HashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String sStr=s.nextLine();
	String sStr1[]=sStr.split(" ");
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	int iCount=0;
	for(int i=0;i<sStr1.length;i++)
	{
		for(int j=0;j<sStr1.length;j++)
		{
			if(sStr1[i].equals(sStr1[j]))
			{
				iCount++;
			}
		}
		hm.put(sStr1[i],iCount);
	}
	Map<String, Integer> hm1 = sortByValue(hm); 
	Set <String> key=hm1.keySet();
	Iterator it=key.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
