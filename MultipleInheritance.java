
/* Program to understand "Concept of Multiple Inheritance"  
*
*Multiple Inheritance can be possible using Interface and we can implement more than one class interface in single class
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
interface Area{
	void Area();
}
class Calculation implements Area,Square{
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

public class MultipleInheritance{
	public static void main(String [] args){
	Calculation c1=new Calculation(3);
	c1.Area();
	}

}
/*
OutPut:-
Area of Circle: 28.26
*/