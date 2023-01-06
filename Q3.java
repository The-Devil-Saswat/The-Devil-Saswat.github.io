package Text1;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner(System.in);
		int[][] arr=new int [2][3];
		int s1=0;
		int s2=0;
		int s3=0;
		System.out.println("Enter the marks of Student 1");
		for (int i=0;i<arr[0].length;i++)
		{
			arr[0][i]=so.nextInt();
			s1+=arr[0][i];
		}
		System.out.println("Enter the marks of Student 2");
		for (int i=0;i<arr[0].length;i++)
		{
			arr[1][i]=so.nextInt();
			s2+=arr[1][i];
		}
		System.out.println("Mark of student 1="+s1+"Mark of student 2="+s2);
		
		
	}

}
