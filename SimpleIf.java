
import java.util.Scanner;
class SimpleIf{	
	public void check(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter a Number: ");
		int num=sc.nextInt();
		if(num>5)
			System.out.println("Yes!! Number is greater than 5");
	}
	public static void main(String[] args){
		SimpleIf si=new SimpleIf();
		si.check();
		System.out.println("Program ends Here !!");
	}
}