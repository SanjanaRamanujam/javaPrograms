import java.util.*;
public class watertank
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int iDays=s.nextInt();
		int iTanks=s.nextInt();
		String sTanks[]=new String[iTanks];
		int iCapacity[]=new int[iTanks];
		int iNeed[]=new int[iTanks];
		for(int i=0;i<iTanks;i++)
		{
			sTanks[i]=s.next();
			iCapacity[i]=s.nextInt();
			iNeed[i]=s.nextInt();
		}
		int iFederal=s.nextInt();
		String sFederal[]=new String[iFederal];
		for(int i=0;i<iFederal;i++)
		{
			sFederal[i]=s.next();
		}
		int iWater[]=new int[iTanks];
		int iCount=0;
		int iMinWater=0;
		int iFlag[]=new int[iTanks];
		int j=0;
		for(int i=0;i<iFederal;i++)
		{
			String sStr[]=sFederal[i].split("_");
			if(sStr[0].equals("F"))
			{
				iFlag[i]+=iCapacity[i];
			}
			if(sStr[0].equals(sTanks[j]))
			{
				iFlag[i]+=iFlag[j];
				j++;
			}
		}
		while(iCount<iDays)
		{
			for(int i=0;i<iTanks;i++)
			{
				if(iWater[i]==0)
				{
					String sStr[]=sFederal[i].split("_");
					if(sStr[0].equals("F"))
					{
						iWater[i]+=iCapacity[i];
						iMinWater+=iCapacity[i];
					}
					else
					{
						for(int k=0;k<iTanks;k++)
						{
							if(sStr[0].equals(sTanks[j]))
							{
								
							}
						}
					}
				}
			}
			iCount++;
		}
	}

}
