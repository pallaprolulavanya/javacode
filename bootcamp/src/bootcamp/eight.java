package bootcamp;

import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Class Held");
		a=sc.nextInt();
		System.out.println("Class Attend");
		b=sc.nextInt();
		c=b/a;
		d=c*100;
		if (d>=75) {
			System.out.println("Student Allowed");
		}
		else {
			System.out.println("Student Not Allowed");
		}
	}

}
