class NewConceptArray{
	public static void main(String[]args){
		int array[][]={
			{2+2,3+2},
			{4+5,3+3}
		};
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}