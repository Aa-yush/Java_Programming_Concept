/*
* Program : To understanding the concept of Static Method 
*
*       Static Method -  
               - We can also initialize Static variable in in Instance Method 	But This is Bad practise to write code  
           
               - Static Method do not use any instance variables of Any object of the class
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*
*/
class Variable{
	private int Id;     // instance Member variable 
	private String Branch;  // instance member variable 
    private static String AcntH; // class variable/static member variable 
    
	public void Instance_Method(int Id,String Branch){     // Instance Method 
		this.Id=Id;
		this.Branch=Branch;
	}
	public static void Static_Method(String Acnt){     // Static Method 
		AcntH=Acnt;    // Assigning value 
		
	}
	public void Display(){                // Display (instance Method)
		System.out.println("Id is: "+Id);
		System.out.println("Branch is: "+Branch);
		System.out.println("Account Number: "+AcntH);
	}
}



public class StaticMethod{
	public static void main(String [] args){
		Variable v1=new Variable();                 // object creation
		v1.Instance_Method(202,"Rohini Sec-24");   // call instance method 
		Variable.Static_Method("98734973223472374"); // calling static Method 
		v1.Display();   // call Display instance Method 
		v1.Static_Method("748794723984792374"); //calling static method through object 
		v1.Display();
	}
}
/*
OutPut is:-
Id is: 202
Branch is: Rohini Sec-24
Account Number: 98734973223472374
Id is: 202
Branch is: Rohini Sec-24
Account Number: 748794723984792374
*/