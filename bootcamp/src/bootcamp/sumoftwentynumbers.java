package bootcamp;

public class sumoftwentynumbers {

	public static void main(String[] args) {
		int sum=0;
		int n=20;
		for (int i = 0; i <= n; i++) {
			sum=sum+i;
		}
		System.out.println("Average of total numbers "+sum/n);
	}

}
