package com.destination.sqlcrudoperations.all;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Create\n"
				+ "2. Insert\n"
				+ "3. Update\n"
				+ "4. Delete\n");
		System.out.println("Please enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Creating The Table");
			
			creating c=new creating();
			boolean b= c.validate();
		}
		
		case 2: {
			System.out.println("Inserting The Values");
		}
		case 3: {
			System.out.println("Updating the Values");
		}
		
		case 4: {
			System.out.println("Deleting The Values");
		}
		default:
			
		}
		
	}

	private static boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

}
