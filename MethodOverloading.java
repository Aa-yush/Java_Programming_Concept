/* Program to understand "Concept of Method Overloading"  
*
*
*
* Method Overloading : All the methods of similar Kinds in a class can have the same name, but remember all the methods will have different prototypes.
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

class Area{
	private int length;
	private int breadth;
	private double radius;
	
	public void set_Area(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void set_Area(double radius){
		this.radius=radius;
	}
	public void display(){
		System.out.println("*****Area of Rectangle*****");
		System.out.println("Lenght is : "+length+" Breadth is: "+breadth+" Area is: "+(length*breadth));
		System.out.println("*****Area of Circle*****");
		System.out.println("Radius is: "+radius+" Area is: "+(2*3.14*radius*radius));
	}
	
	
}


public class MethodOverloading{
	public static void main(String args[]){
	Area a1=new Area();
    a1.set_Area(20,30);
	a1.set_Area(3.00);
	a1.display();
	}
}
/*
OutPut:-
*****Area of Rectangle*****
Lenght is : 20 Breadth is: 30 Area is: 600
*****Area of Circle*****
Radius is: 3.0 Area is: 56.519999999999996
*/