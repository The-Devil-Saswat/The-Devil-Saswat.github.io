
public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {
						{00,01,02,03,04,05},
						{10,11,12,13,14,15},
						{20,21,22,23,24,25},
						{30,31,32,33,34,35},
						{40,41,42,43,44,45},
						{50,51,52,53,54,55}
		};
		int m=6;
		int n=6;
		int k=0;
		int l=0;
		while (k < m && l < n) {
			
	            for (int i = l; i < n; ++i) {
	                System.out.print(a[k][i] + " ");
	            }
	            k++;
	            System.out.println();
	 
	            for (int i = k; i < m; ++i) {
	                System.out.print(a[i][n - 1] + " ");
	            }
	            n--;
	            System.out.println();
	 
	            if (k < m) {
	                for (int i = n - 1; i >= l; --i) {
	                    System.out.print(a[m - 1][i] + " ");
	                }
	                m--;
	                System.out.println();
	            }
	 
	            if (l < n) {
	                for (int i = m - 1; i >= k; --i) {
	                    System.out.print(a[i][l] + " ");
	                }
	                l++;
	                System.out.println();
	            }
	        }
				

	}

}
