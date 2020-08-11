class ParentClass{
	int x,y;
	public ParentClass(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void add(){
		int sum=x+y;
		System.out.println("Addition = "+sum);
	}
}

public class ChildClass extends ParentClass{
	int x,y;
	public ChildClass(int x,int y){
		super(10,3);
		this.x=x;
		this.y=y;
	}
		
	public void minus(){
		super.add();  //parent function calling
		int minus=x-y;
		System.out.println("Substraction = "+minus);
	}
	public void display(){
		System.out.println("Parent var1: "+super.x+" var2: "+super.y);
		System.out.println("ChildClass var1: "+x+" var2: "+y);		
	}
	public static void main(String [] args){
		ChildClass cc=new ChildClass(15,10);
		cc.add(); // parent function calling
		cc.minus();
		cc.display();
	}
}