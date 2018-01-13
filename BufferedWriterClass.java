
/* Program :- Write in File using Buffered writer class    
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
import java.util.*;
public class BufferedWriterClass{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		FileWriter fr=new FileWriter("C:\\Users\\ayush\\Desktop\\t1.txt",true);
		BufferedWriter bw=new BufferedWriter(fr);
		System.out.println("Enter data");
		String s= sc.nextLine();
		bw.write(s);
		bw.close();
	}
}