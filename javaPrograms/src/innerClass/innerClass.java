package innerClass;

public class innerClass {
	class Inner{
		public void show() {
			
			System.out.println("In a nested class method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClass.Inner in = new innerClass().new Inner();
		in.show();

	}

}
