class Operation{
	static int x;
	static int y;
	public static void add(){
		x=10;
		y=90;
		int sum=x+y;
		System.out.println("Sum="+sum);
	}
}
class StaticMethod{
	public static void main(String [] args){
		Operation.add();
	}
} 