/* Program to understand "Concept of Using Object as Parameters"  
*
*
*
* PassByReference : Object passing as parameter in java are refered to as passing by reference.  
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

class Student{
	private String name;
	private int marks;
	private String grade;
	public Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	
	public void setGrade(Student s){
			if(s.marks<50)
				grade="C";
			if(s.marks>50 && s.marks<70)
				grade="B";
			if(s.marks>70)
				grade="A";
		}
		public void  display(){
		System.out.println("Name is: "+name);
		System.out.println("Marks is: "+marks);
		System.out.println("Grade is: "+grade);		
	}
}

public class PassByReference{
	public static void main(String [] args){
		
		Student s1=new Student("Ayush Gupta",98);
		s1.setGrade(s1);  // passing reference
		s1.display();
		Student s2=new Student("Sanjeev Sethi",35);
		s2.setGrade(s2);
		s2.display();
		
	}
}
/*
OutPut:-
Name is: Ayush Gupta
Marks is: 98
Grade is: A
Name is: Sanjeev Sethi
Marks is: 35
Grade is: C
*/