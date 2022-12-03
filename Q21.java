import java.util.Scanner;
public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner(System.in);
		
		int r=so.nextInt();
		int c=so.nextInt();
		int [][] mat1= new int[r][c];
		
		int r2=so.nextInt();
		int c2=so.nextInt();
		int [][] mat2= new int[r2][c2];
		
		
		if (c==r2 && c>0 && r2>0 && r>0 && c2>0)
		{
			for (int i=0;i<r;i++)
				for (int j=0;j<c;j++)
					mat1[i][j]=so.nextInt();
			
			for (int i=0;i<r2;i++)
				for (int j=0;j<c2;j++)
					mat2[i][j]=so.nextInt();
			
			
			int [][] ans=new int[r][c2];
			for (int i=0;i<r;i++)
				for (int j=0;j<c;j++)
					for (int k=0;k<c2;k++)
						ans[i][k]+=mat1[i][j]*mat2[j][k];
			
			for (int[] temp : ans) {
	            for (int val : temp) {
	                System.out.print(val + "   ");
	            }
	            System.out.println();
	        }
		}
	}

}