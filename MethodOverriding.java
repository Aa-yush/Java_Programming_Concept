
/*  Program  To Understand the concept of method Overriding
*
* Method Overriding - ability to define a behaviour thats's specific to the subclass type, which means a subclass can implement a parent class method based on its requirement.
*
*            - Overiding methods must have exactly the same arguments list , both in type and in order.
*
*              - It should have exactly the same return type as the method it overides.
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/


class Honda{
	public void enginePower(){
		System.out.println("1200cc");
	}
}
class Maruti extends Honda{
	public void enginePower(){
		System.out.println("1500cc");
	}
}
class BMW extends Maruti{
	public void enginePower(){
		System.out.println("3000cc");
	}
}

public class MethodOverriding{
	public static void main(String[] args){
		BMW b1=new BMW();
		b1.enginePower(); // enginePower method of BMW class gets more preference
		Maruti m1=new Maruti();
		m1.enginePower(); // enginePower method of Maruti class gets more preference
	}
}
/*
Output:-
3000cc
1500cc
*/