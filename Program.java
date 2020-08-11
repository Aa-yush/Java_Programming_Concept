// Program to find out the greater number between two digit using only one "if" Statement.

import java.util.Scanner;

class Program{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First no:");
		int a=sc.nextInt();
		System.out.println("Enter Second no:");
		int b=sc.nextInt();
		if(a>b){
			System.out.println(a+" is greater than"+b);
			System.exit(0);
		}
		System.out.println(b+" is greater than"+a);
	}
}