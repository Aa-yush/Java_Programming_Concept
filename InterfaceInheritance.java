

/* Program to understand "Concept of Interface Inheritance"  
*
*Interface Inheritance: One interface can inherit another interface using extends Keyword 
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

interface Square{
	int Square(int radius);
}
interface Area extends Square{
	void Area();
}
class Calculation implements Area{
	private int radius;
	
	public Calculation(int radius){
		this.radius=radius;
	}
	
	public int Square( int radius){
		return(radius*radius);
	}
	
	public void Area(){
		int square= Square(radius);
		System.out.println("Area of Circle: "+(3.14*square));
	}
}

public class InterfaceInheritance{
	public static void main(String [] args){
	Calculation c1=new Calculation(3);
	c1.Area();
	}

}
/*
OutPut:-
Area of Circle: 28.26
*/