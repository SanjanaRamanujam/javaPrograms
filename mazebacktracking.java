public class mazebacktracking 
{
	static int iMaze[][]= {{0,0,0,0},{1,1,0,1},{0,1,0,0},{0,1,0,0}};
	static int iCount=0,iMin=Integer.MAX_VALUE;
	public static boolean solution(int iRow,int iCol,int iSolution[][])
	{
		if(iRow==3&&iCol==3)
			{
			iSolution[3][3]=1;
				System.out.println("Goal Reached");
				System.out.println("Steps :"+(iCount+1));
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<4;j++)
					{
						System.out.print(iSolution[i][j]+" ");
					}
					System.out.println();
				}
				return true;
			}
			if(iRow>=0&&iCol>=0&&iRow<4&&iCol<4&&iMaze[iRow][iCol]!=1&&iSolution[iRow][iCol]==0)
			{
				iSolution[iRow][iCol]=1;
				iCount++;
				if(solution(iRow+1,iCol,iSolution))
				{
					return true;
				}
				if(solution(iRow,iCol+1,iSolution))
				{
					return true;
				}
				if(solution(iRow-1,iCol,iSolution))
				{
					return true;
				}
				iSolution[iRow][iCol]=0;
				return false;
			}
		return false;
}
	public static void main(String[] args) 
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(iMaze[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int iSolution[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		boolean flag=solution(0,0,iSolution);
		if (flag == false)
		{
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					System.out.print(iSolution[i][j]+" ");
				}
				System.out.println();
			}
		   System.out.println("Goal not reached");
		}
	}

}



//public class mazebacktracking 
//{
//	static int iMaze[][]= {{0,0,0,0},{1,1,0,1},{0,1,0,0},{0,1,0,0}};
//	static int iRes[][]=new int[4][4];
//	static int iCount=0,iMin=Integer.MAX_VALUE;
//	public static boolean solution(int iRow,int iCol,int iSolution[][])
//	{
//		if(iRow==3&&iCol==3)
//			iSolution[3][3]=1;
//			{
//			if(iMin>iCount)
//			{
//				iMin=iCount;
//				for(int i=0;i<4;i++)
//					{
//						for(int j=0;j<4;j++)
//						{
//							iRes[i][j]=iSolution[i][j];
//							System.out.print(iSolution[i][j]+" ");
//						}
//						System.out.println();
//					}
//				return false;
//			}
//			}
//			if(iRow>=0&&iCol>=0&&iRow<4&&iCol<4&&iMaze[iRow][iCol]!=1&&iSolution[iRow][iCol]==0)
//			{
//				iSolution[iRow][iCol]=1;
//				iCount++;
//				if(solution(iRow+1,iCol,iSolution))
//				{
//					return true;
//				}
//				if(solution(iRow,iCol+1,iSolution))
//				{
//					return true;
//				}
//				if(solution(iRow-1,iCol,iSolution))
//				{
//					return true;
//				}
//				iSolution[iRow][iCol]=0;
//				return false;
//			}
//		return false;
//}
//	public static void main(String[] args) 
//	{
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				System.out.print(iMaze[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		int iSolution[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
//		boolean flag=solution(0,0,iSolution);
//		if (flag == false)
//		{
//			for(int i=0;i<4;i++)
//			{
//				for(int j=0;j<4;j++)
//				{
//					System.out.print(iSolution[i][j]+" ");
//				}
//				System.out.println();
//			}
//		   System.out.println("Goal not reached");
//		}
//		else
//		{
//			for(int i=0;i<4;i++)
//			{
//				for(int j=0;j<4;j++)
//				{
//					System.out.print(iRes[i][j]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println("Goal Reached");
//		}
//	}
//
//}
