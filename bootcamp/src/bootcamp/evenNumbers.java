package bootcamp;

public class evenNumbers {

	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i <= 20; i++) {
			if (i%2 ==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("The count of even numbers " + count);

	}

}
