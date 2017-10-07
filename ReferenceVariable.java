
/* Program to understand "Concept of Assigning object Reference Variable"  
*
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

class Employee{
	String name;  // instance variable
	String phn;   // instance variable 
	public void Display(){        // Method
		System.out.println("Name: "+name+" Phone Number is:"+phn);
	}
}
public class ReferenceVariable{
	public static void main(String[] args){
		Employee e1=new Employee(); // object creation
		Employee e2=new Employee();
		e1.name="Ayush Gupta";
		e1.phn="8745056594";
		e1.Display();
		e2=e1;             // object e1 assigning in e2 as reference variable
		e2.name="Sanjana Singh";
		e2.Display();		
	}
}

/* OutPut:-

Name: Ayush Gupta Phone Number is:8745056594
Name: Sanjana Singh Phone Number is:8745056594

*/