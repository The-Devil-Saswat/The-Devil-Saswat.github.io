import java.util.Scanner;
public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner(System.in);
		
		int r=so.nextInt();
		int c=so.nextInt();
		int [][] mat1= new int[r][c];
		
		int r2=so.nextInt();
		int c2=so.nextInt();
		int [][] mat2= new int[r2][c2];
		for (int i=0;i<r;i++)
			for (int j=0;j<c;j++)
				mat1[i][j]=so.nextInt();
		
		for (int i=0;i<r;i++)
			for (int j=0;j<c;j++)
				mat2[i][j]=so.nextInt();
		
		if (r==r2 && c==c2)
		{
			int [][] ans=new int[r][c];
			for (int i=0;i<r;i++)
				for (int j=0;j<c;j++)
					ans[i][j]=mat1[i][j]+mat2[i][j];
			
			for (int[] temp : ans) {
	            for (int val : temp) {
	                System.out.print(val + "   ");
	            }
	            System.out.println();
	        }
		}
	}

}