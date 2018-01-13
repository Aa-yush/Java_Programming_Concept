
/* Program :- How to make an unequal pattern through Arrays  
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

public class TwoD{
	public static void main(String [] args ){
		
	int k=0;
		int array[][]=new int [5][];
		array[0]=new int[1];
		array[1]=new int[2];
		array[2]=new int[3];
		array[3]=new int[4];
		array[4]=new int[5];
		
		
		for (int i=0;i<5;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(k +" ");
				k++;
			}
				System.out.println();
		}
			
	}
}

/*
Output:-
0
1 2
3 4 5
6 7 8 9
10 11 12 13 14
*/