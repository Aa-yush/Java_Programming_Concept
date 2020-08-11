class BreakLoop{
	public static void main(String [] args){
		follow:{
			for(int x=0;x<100;x++){
			if(x==10) break follow;
			System.out.print(x+" ");
		}
		}
	}
}