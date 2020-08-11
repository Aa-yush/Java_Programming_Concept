import java.util.Scanner;
class Pattern4{
	public static void main(String [] args ){
		Scanner sc =new Scanner(System.in);
		System.out.print("How many times: ");
		int num=sc.nextInt();
		
		for(int row=1;row<=num;row++){
			for(int space=num;space>=row;space--){
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++){
				System.out.print(col);
			}
			System.out.println();
		}
			
	}
}

/*   
	 1
    12
   123
  1234
 12345



*/