public class CommandLine{
	public void function(int ... var3){
		int size = var3.length;
		System.out.println("Size of array : "+size);
	}
	
	public static void main(String ... args){  
/*		int flag=1;
		int ... var = new int[5];	//compilation error
		int ... var2 = {12,32,44,65,76}; //compilation error 
		for(int i=0;i<var.length;i++){
			var[i]=flag++;
		}
		for(int i=0;i<var.length;i++){
			System.out.println(var2[i]);
		}									*/
		CommandLine cl=new CommandLine();
		cl.function(2,3,4,5,6,7,8);
	}
}