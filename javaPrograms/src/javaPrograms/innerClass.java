package javaPrograms;

public class innerClass {
	class Inner{
		public void show() {
			System.out.println("In a nested class method");
		}
	}

	public static void main(String[] args) {
		innerClass.Inner in = new innerClass().new Inner();
		in.show();

	}

}
