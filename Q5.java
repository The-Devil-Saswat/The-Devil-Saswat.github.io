package Text1;
import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner (System.in);
		int[][] arr=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[6];
		System.out.println("Part 1");
		for (int i=0;i<arr[0].length;i++)
			arr[0][i]=so.nextInt();
		System.out.println("Part 2");
		for (int i=0;i<arr[1].length;i++)
			arr[1][i]=so.nextInt();
		for (int i=0;i<arr[0].length;i++)
			System.out.print(arr[0][i]+"  ");
		System.out.println();
		for (int i=0;i<arr[1].length;i++)
			System.out.print(arr[1][i]+"  ");

	}

}
