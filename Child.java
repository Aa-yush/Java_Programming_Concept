class Parent{
	void Overriden(){
		System.out.println("This is an Parent Class Method");
	}
}

public class Child extends Parent{
	public void Overriden(){
		System.out.println("This is an Child Class Method");
	}
	public static void main(String [] args){
		Child ch=new Child();
		ch.Overriden();
	}
}