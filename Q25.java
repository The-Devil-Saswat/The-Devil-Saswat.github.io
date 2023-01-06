package Text1;
import java.util.*;
public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		int[] arr= {1,2,5,10,20,50,100,200,500,2000};
		System.out.println("Enter the amount");
		int x=so.nextInt();
		for (int i=arr.length-1;i>=0;i--)
		{
			int c=0;
			while (x-arr[i]>=0)
			{
				x-=arr[i];
				c++;
			}
			if(c!=0)
				System.out.println("No of note reqiued of Rs."+arr[i]+" is "+c);
		}

	}

}
