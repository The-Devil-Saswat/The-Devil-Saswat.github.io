import java.util.Scanner;
public class Dec_Bin {
	static String Con(int a)
	{
		String s="";
		for (int i=1;a>0;i++)
		{
			s+=a%2;
			a=a/2;
		}
		for (int i=s.length();i<8;i++)
			s+="0";
		String st="";
		for (int i=s.length()-1;i>=0;i--)
		{
			char S;
			S=s.charAt(i);
			st=st+S;
		}
		return st;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner(System.in);
		int a=so.nextInt();
		int b=so.nextInt();
		String na=Con(a);
		String nb=Con(b);
		System.out.println(na);
		System.out.println(nb);

	}

}
