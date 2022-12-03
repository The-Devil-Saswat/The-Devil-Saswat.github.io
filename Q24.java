import java.util.Scanner;
public class Q24 {
	
	static int[][] mult(int[][] mat1,int[][] mat2)
	{
		int [][] ans=new int[mat1.length][mat2[0].length];
		for (int i=0;i<mat1.length;i++)
			for (int j=0;j<mat1[0].length;j++)
				for (int k=0;k<mat2[0].length;k++)
					ans[i][k]+=mat1[i][j]*mat2[j][k];
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner(System.in);
		
		System.out.println("mat1");
		
		int r=so.nextInt();
		int c=so.nextInt();
		int [][] mat1= new int[r][c];
		
		System.out.println("mat2");
		
		int r2=so.nextInt();
		int c2=so.nextInt();
		int [][] mat2= new int[r2][c2];
		
		System.out.println("mat3");
		
		int r3=so.nextInt();
		int c3=so.nextInt();
		int [][] mat3= new int[r3][c3];
		
		
		if (c==r2 && c2==r3 && c>0 && r2>0 && r>0 && c2>0 && c3>0 && r3>0)
		{
			System.out.println("Mat 1 val");
			for (int i=0;i<r;i++)
				for (int j=0;j<c;j++)
					mat1[i][j]=so.nextInt();
			
			System.out.println("Mat 2 val");			
			for (int i=0;i<r2;i++)
				for (int j=0;j<c2;j++)
					mat2[i][j]=so.nextInt();
			
			System.out.println("Mat 3 val");
			for (int i=0;i<r3;i++)
				for (int j=0;j<c3;j++)
					mat3[i][j]=so.nextInt();
			
			int ans[][]=mult(mat1,mat2);
			
			int ans1[][]=mult(ans,mat3);
			
			for (int[] temp : ans1) {
	            for (int val : temp) {
	                System.out.print(val + "   ");
	            }
	            System.out.println();
	        }
		}
	}

}