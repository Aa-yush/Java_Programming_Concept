import java.util.Scanner;
class Pattern{
	public static void main(String [] args ){
		Scanner sc =new Scanner(System.in);
		System.out.print("How many times: ");
		int num=sc.nextInt();
		
		for(int row=1;row<=num;row++){
			for(int col=1;col<=row;col++){
				System.out.print(row+" ");
			}
			System.out.println();
		}
			
	}
}

/*

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6

*/