public class Block{
	static int x;
	static double y;
	static{
		System.out.println("Static block runs before the main block");
		x=10;
		y=10.78;
	}
	public static void main(String [] args){
		System.out.println("Main method runs after static block");
		System.out.println("x="+x+" y="+y);
		}
}