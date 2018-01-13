/* Program :- Perform Operations at the time of initialization in Two Dimmenentional Array   
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

public class ArrayTwoD{
	public static void main(String [] args){
		int array[][]={
			{0*0,0*1,0*2},
			{1*0,1*1,1*2},
			{2*0,2*1,2*2}
		};
		
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(array[i][j]+" ");
			System.out.println();
		}
	}
}


/*
OUTPUT:- 
0 0 0
0 1 2
0 2 4

*/