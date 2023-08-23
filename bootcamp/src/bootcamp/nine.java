package bootcamp;

public class nine {

	public static void main(String[] args) {
		int sum=0;
		long product = 1;
		for (int i = 1;i<=20;i++) {
			sum=sum+i;
			product=product*i;
		}
		System.out.println("Sum - "+sum);
		System.out.println("Product - "+product);

	}

}
