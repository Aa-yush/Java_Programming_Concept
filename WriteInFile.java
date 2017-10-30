
/* Program to understand "How to write in File"   
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
import java.util.*;
public class WriteInFile{
	public static void main(String []args) throws IOException{
		Scanner sc = new Scanner(System.in);
		FileOutputStream fout = new FileOutputStream("C:\\Users\\ayush\\Desktop\\New folder\\abc.txt");
		System.out.println("Enter String to write in File: ");
		String s1 = sc.nextLine();
		char ch[]= s1.toCharArray();
		for (int i=0;i<s1.length();i++)
			fout.write(ch[i]);
		fout.close();
	}
}