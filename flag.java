import java.util.*;
import java.io.*;
public class flag {

	public static void main(String[] args) throws Exception{
				Scanner s=new Scanner(System.in);
				//int iN=s.nextInt();
				ArrayList<String> al=new ArrayList<String>();
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				while(( br.readLine()) != null)
				{
					al.add(br.readLine());
				}
				HashMap<String,Integer> hm=new HashMap<String,Integer>();
				int bill=0;
				for(String a:al)
				{
					bill=0;
					String flag[]=a.split(",");
					String duration[]=flag[0].split(":");
					int secs=0;
					secs+=Integer.parseInt(duration[2]);
					//System.out.println(duration[2]);
					secs+=Integer.parseInt(duration[1])*60;
					//System.out.println(duration[1]);
					secs+=Integer.parseInt(duration[0])*3600;
					//System.out.println(duration[0]);
					if(secs<300)
					{
						bill+=secs*3;
					}
					else if(secs==300)
					{
						bill+=Integer.parseInt(duration[1])*150;
					}
					else if(secs>300)
					{
						if(secs%60==0)
						{
							bill+=Integer.parseInt(duration[1])*150;
						}
						else
						{
							bill+=(Integer.parseInt(duration[1])+1)*150;
						}
					}
					//System.out.println(bill);
					//int flag1=0;
					if(hm.containsKey(flag[1]))
					{
						hm.replace(flag[1], hm.get(flag[1])+bill);
					}
					else
					{
						hm.put( flag[1],bill);
					}
				}
				System.out.println(hm);
				ArrayList<Integer> al1=new ArrayList<Integer>();
				Set<Map.Entry<String,Integer>> hm1=hm.entrySet();
				for(Map.Entry<String, Integer> pairs:hm1)
				{
					Integer bill1=pairs.getValue();
					al1.add(bill1);
				}
				Collections.sort(al1);
				al1.remove(al1.size()-1);
				int finalbill=0;
				for(Integer d:al1)
				{
					finalbill+=d;
				}
				System.out.println(finalbill);
	}
	}
