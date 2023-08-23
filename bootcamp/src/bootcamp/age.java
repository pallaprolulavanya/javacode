package bootcamp;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		System.out.println("Enter Age Of A");
		a=sc.nextInt();
		System.out.println("Enter Age Of B");
		b=sc.nextInt();
		System.out.println("Enter Age Of C");
		c=sc.nextInt();
		if (a<b && a<c) {
			System.out.println("A is youngest");
		}
		else if (b<a && b<c) {
			System.out.println("b is youngest");
		}
		else if (c<a && c<b) {
			System.out.println("c is youngest");
		}
		else {
			System.out.println("All are Equal");
		}
		
		if (a>b && a>c) {
			System.out.println("A is Oldest");
		}
		else if (b>a && b>c) {
			System.out.println("B is Oldest");
		}
		else if (c>a && c>b) {
			System.out.println("C is Oldest");
		}
		else {
			System.out.println("All are Equal");
		}
	}

}
