package bootcamp;

public class sumofarray {

	public static void main(String[] args) {
		int arr[]= {5,10,15,20,25};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum is "+sum);
	}

}
