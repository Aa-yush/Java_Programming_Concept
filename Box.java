/* Program to understand-"How to create an object and How to call method from objects"   
*
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

class Example {
	private int length; // instance member variable 
	private int breadth; // instance member variable
	private int height;  // instance member variable
	
	public void set_Dimension( int l, int b, int h) {       // instance member function
		length=l;              // set length 
		breadth=b;              // set breadth  
		height=h;              // set height
	}
	
	public void Display(){                         // Display member variable
		System.out.println( "Lenght: " +length );
		System.out.println( "Breadth: "+breadth );
		System.out.println( "Height: " +height );
	}
}

public class Box {
	
	public static void main ( String []args ) {
		
/* Creation of Object - Java always make the object dynamically */

	Example e1=new Example(); // Here, e1 is reference variable of class Example
	
/*  We call the method set_Dimension with the help of reference variable of Example class */
	
	        e1.set_Dimension(10,20,30);
			
/*  We call the method Display with the help of reference variable of Example class */	

       		e1.Display();
	}
}

/* Output:-
                Lenght: 10
				Breadth: 20
				Height: 30
				                   */
