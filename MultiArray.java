class MultiArray{
	public static void main(String[] args){
		int array[][]=new int[5][];
		array[0]=new int[1];
		array[1]=new int[2];
		array[2]=new int[3];
		array[3]=new int[4];
		array[4]=new int[5];
		int k=0;
		
		for(int i=0;i<5;i++){
			for(int j=0;j<i+1;j++){
				array[i][j]=k;
				System.out.print(array[i][j]+" ");
				k++;
			}
			System.out.println();
		}
		
	}
}
/*
Output:
0
1 2
3 4 5
6 7 8 9
10 11 12 13 14
*/