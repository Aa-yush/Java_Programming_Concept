
/*  Program  To Understand the concept of Order of constructor (Multilevel Inheritance)
*
*  - when the object of a subclass is created the constructor of the subclass is called which in turn calls constructor of its immediate superclass           
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

class A{
	public A(){
		System.out.println("Constructor A");
	}
}
class B extends A{
	public B(){
			System.out.println("Constructor B");
	}
}
class C extends B{
	public C(){
			System.out.println("Constructor C");
	}
}
public class InheritanceConstructor{
	public static void main(String[] args){
		C c1=new C();
	}
}
/*
OutPut:-
Constructor A
Constructor B
Constructor C
*/