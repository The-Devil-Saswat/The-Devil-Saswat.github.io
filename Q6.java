package Text1;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello I am Saswat Pattnaik";
		char[] arr=new char[10];
		s.getChars(1, 11, arr, 0);
		for (char e:arr)
			System.out.println(e);

	}

}
