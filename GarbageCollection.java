/*  Program  To Understand the concept of Finalize method  
*
*
* Finalize Method- The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. 
*
* gc() method- The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

class Employee{
	private String empid;
	private String name;
	private String desig;
	
	public Employee(String empid,String name,String desig){
		this.empid=empid;
		this.name=name;
		this.desig=desig;
	}
	
	public void display(){
		
		System.out.println("Employee Id: "+empid);
		System.out.println(" Employee Name: "+name);
		System.out.println(" Employee Designation: "+desig);
	}
	protected void finalize(){
		System.out.println("Object Destruction");
	}
	
}


public class GarbageCollection{
	public static void main(String[] args){
		Employee e1=new Employee("E10","Ayush Gupta","CEO");
		Employee e2=new Employee("E20","Preeti","Manager");
		e1.display();
		System.out.println("*************************");
		e2.display();
		System.out.println("*************************");
		e1=null;
		e2=null;
		System.out.println("When both Objects not referencing");
		System.gc();   // garbage collection method invoked
	}
}
/*
Output:-
Employee Id: E10
 Employee Name: Ayush Gupta
 Employee Designation: CEO
*************************
Employee Id: E20
 Employee Name: Preeti
 Employee Designation: Manager
*************************
When both Objects not referencing
Object Destruction
Object Destruction
*/