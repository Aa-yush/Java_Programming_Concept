
/*  Program  To Understand the concept of Super Keyword
*
*Super Keyword : The super keyword is similar to this keyword. Following are the scenarios where the super keyword is used
*         -It is used to differentiate the members of superclass from the members of subclass, if they have same names.
*         -It is used to invoke the superclass constructor from subclass. 
*            
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

class Super{
	protected int age;
  public void setAge(int age){
	  this.age=age;
  }
  public void method(){
	  if(age>18)
		  System.out.println("Adult");
	  else
		  System.out.println("Not Adult");
  } 
}
class Sub extends Super{
	 public void method(){
		 super.method();
	if(age>18)
		System.out.println("Eligible for Vote");
	else
		System.out.println("Not Eligible for Vote");
	 }
}

public class SuperKeyword {
	public static void main(String [] args){
	Sub s1=new Sub();
    s1.setAge(22);
	s1.method();
	}
}
/*
Output:-
Adult
Eligible for Vote
*/