
/* Program to understand "Concept of Package Creation"  
*
*Package :- Package is used in java in order to prevent naming conflicts to control access to make seaching/locating and usage of classes,interfaces,enumeration and annotations easier etc.
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

package Student;        // create an package of the name Student
public class Student{
	private int rollno;
	private String name;
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getRollno(){
		return(rollno);
	}
	
	public String getName(){
		return(name);
	}
	public Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
}
	
/* How to Compile -
						javac -d . Student.java
-d is a directory keyword , to make directory , dot(.) shows current path than className.java 

*/