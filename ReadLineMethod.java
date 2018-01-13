
/* Program :- Concept of Realine from files   
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
public class ReadLineMethod{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ayush\\Desktop\\BubbleSort.java"));
		String s;
		while((s=br.readLine())!=null)
		System.out.println(s);
		br.close();		
		}
}