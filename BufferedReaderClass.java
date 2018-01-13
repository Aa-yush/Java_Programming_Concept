
/* Program :- Read from file using BufferedReader Class 
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
public class BufferedReaderClass{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ayush\\Desktop\\BubbleSort.java"));
		int ch;
		while((ch=br.read())!=-1)
		System.out.print((char)ch);
		br.close();
		
		}
}