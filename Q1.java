package Text1;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		System.out.println("Enter No. of Subject");
		int s=so.nextInt();
		int [] mark=new int[s];
		for (int i=0;i<mark.length;i++)
			mark[i]=so.nextInt();
		double sum=0;
		for (int i=0;i<mark.length;i++)
			sum+=mark[i];
		double per=(sum/(s*100))*100;
		System.out.println("Total mark ="+sum+" Percentage ="+per);

	}

}