
/* Program to understand "Concept of Constructor Overloading"  
*
*
*Constructor Overloading:- The Constructor in a class either will have different types of argument or different number of arguments passed to it.
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/
class College{
	private String enroll;
	private String name;
	private String course;
	private String faculty_id;
	
	public College(String enroll,String name,String course){
		this.enroll=enroll;
		this.name=name;
		this.course=course;
		
		System.out.println("*****Student Details*****");
		System.out.println("Enrollment is :"+enroll);
		System.out.println("Name is :"+name);
		System.out.println("Course is :"+course);
		
	}
		public College(String faculty_id,String name){
		this.faculty_id=faculty_id;
		this.name=name;
		
		System.out.println("*****Faculty Details*****");
		System.out.println("Faculty id is :"+faculty_id);
		System.out.println("Name is :"+name);

		
	}
}


public class ConstructorOverloading{
	public static void main(String[] args){
		College c1=new College("163078540","Ayush Gupta","BCA");
		College c2=new College("F12","Manish Jha");
	}
}
/*
Output:-
*****Student Details*****
Enrollment is :163078540
Name is :Ayush Gupta
Course is :BCA
*****Faculty Details*****
Faculty id is :F12
Name is :Manish Jha
*/