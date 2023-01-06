package Text1;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {90,70,15,66,55,10,5,64};
		for (int i=0;i<arr.length;i++)
			for (int j=0;j<arr.length-i-1;j++)
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		System.out.println("After Sorting");
		for (int e:arr)
			System.out.println(e+" ");

	}

}
