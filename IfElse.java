
import java.util.Scanner;
class IfElse{	
	public void check(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter a Number: ");
		int num=sc.nextInt();
		if(num>5)
			System.out.println("Yes!! Number is greater than 5");
		else
			System.out.println("No!! Number is not greater than 5");
	}
	public static void main(String[] args){
		IfElse si=new IfElse();
		si.check();
		System.out.println("Program ends Here !!");
	}
}