/* Program to understand "Concept of Import Package"  
*
*Import: Import statement is a way of giving the proper location for the compiler to find that particular class and make it use in current class.
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

import Student.Student;
public class Main{
	public static void main(String[] args){
		Student s1=new Student(101,"Ayush Gupta");
		System.out.println("Roll Number: "+s1.getRollno());
		System.out.println("Name is: "+s1.getName());
	}
}

/* Compile and run -

C:\Users\ayush\Desktop\Package_Concept>javac Main.java

C:\Users\ayush\Desktop\Package_Concept>java Main

Roll Number: 101
Name is: Ayush Gupta

*/