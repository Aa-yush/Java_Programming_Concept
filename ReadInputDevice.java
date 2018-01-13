

/* Program :- Write a program which reads string from input device and prints back the same on the screen    
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
import java.io.*;
public class ReadInputDevice{
	public static void main(String[] args) throws Exception{
		byte[] bytes=new byte[20];
		System.out.println("Enter a String");
		for(int i=0;i<20;i++)
		bytes[i]=(byte)System.in.read();
		System.out.println("You Entered: ");
		System.out.write(bytes);
	}
}