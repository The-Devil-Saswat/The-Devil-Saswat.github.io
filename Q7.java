package Text1;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello I am Saswat Pattnaik";
		int c=0;
		for(int i=c;i<s.length();i++)
		{
			char temp=s.charAt(i);
			if (temp==' ')
			{
				System.out.println(s.substring(c,i));
				c=i+1;					
			}
		}

	}

}
