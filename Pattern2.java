import java.util.Scanner;
class Pattern2{
	public static void main(String [] args ){
		Scanner sc =new Scanner(System.in);
		System.out.print("How many times: ");
		int num=sc.nextInt();
		
		for(int row=1;row<=num;row++){
			for(int col=1;col<=row;col++){
				System.out.print(col+" ");
			}
			System.out.println();
		}
			
	}
}

/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

*/