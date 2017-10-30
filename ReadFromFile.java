
/* Program to understand "Concept of How To read From File"  
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
public class ReadFromFile{
	public static void main(String []args) throws IOException{
		int i;
		FileInputStream fis=new FileInputStream("C:\\Users\\ayush\\Desktop\\New folder\\abc.txt");
		do{
			i=fis.read();
			if(i!=-1)
				System.out.print((char)i);
		}while(i!=-1);
		fis.close();
	}
}