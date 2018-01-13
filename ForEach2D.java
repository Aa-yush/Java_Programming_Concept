

/* Program :-Working of For-each Loop with 2D Array  
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

import java.util.*;

public class ForEach2D{
	public static void main(String [] args ){
		Scanner sc=new Scanner(System.in);
		int array[][]=new int[3][3];
		
		System.out.println("Enter nine Elements: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				array[i][j]=sc.nextInt();
				
		
		for(int x[]:array){
			for(int y:x)
			System.out.print(y+" ");
			System.out.println();
		}
		
		
	}
}

/*
Output:-

Enter nine Elements:
12
13
11
23
43
54
64
23
75
12 13 11
23 43 54
64 23 75

*/