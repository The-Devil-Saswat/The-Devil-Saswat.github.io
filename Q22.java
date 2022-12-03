
public class Q22 {
	
	static boolean check_9(int[][]arr) 
	{
		
		for (int i=0;i<9;i++)
		{
			for (int j=0;j<9;j++)
			{
				if (arr[i][j]>9 || arr[i][j]<=0)
					return false;
			}
			
		}
		return true;
		
	}
	
	static boolean check_re(int[][]arr) 
	{
		
		for (int i=0;i<9;i++)
		{
			int[] temp=arr[i];
			for (int j=0;j<9;j++)
			{
				for (int k=0;k<9;k++)
				{
					if (temp[j]==temp[k] && j!=k)
						return false;
				}
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid = {  	   
							{1,2,3,4,5,6,7,8,9},   
							{9,1,2,3,4,5,6,7,8},   
							{8,9,1,2,3,4,5,6,7},   
							{7,8,9,1,2,3,4,5,6},   
							{6,7,8,9,1,2,3,4,5},   
							{5,6,7,8,9,1,2,3,4},   
							{4,5,6,7,8,9,1,2,3},   
							{3,4,5,6,7,8,9,1,2},
							{2,3,4,5,6,7,8,9,1}
		       			};
		
		//row formation
		int count=1;
		int c=0;
		int[][] gridr=new int[9][9];
		for (int k=0;k<3;k++)
		{
			int cin=1;
			for (int i=0;i<9;i++)
			{
				
				for (int j=k*3;j<(k*3)+3;j++)
				{
					if (count%9==1)
						c++;
					gridr[c-1][((cin-1)%9)]=grid[i][j];
					cin++;
					count++;
				}
			}
						
		}
		
		
		//col formation
		int[][] gridc=new int[9][9];
		for (int i=0;i<9;i++)
			for (int j=0;j<9;j++)
				gridc[i][j]=grid[j][i];
		
		
		if (false==check_9(gridc))
			System.out.println("No in col greater than 9");
		if (false==check_9(gridr))
			System.out.println("No in box greater than 9");
		if (false==check_9(grid))
			System.out.println("No in row greater than 9");
		if (false==check_re(gridc))
			System.out.println("Rep in col");
		if (false==check_re(gridr))
			System.out.println("rep in box");
		if (false==check_re(grid))
			System.out.println("rep in row");
					

	}

}
