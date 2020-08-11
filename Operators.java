//Program to perform operation with operators
import java.util.*;
class Operators
{
 public static void main(String... arr)
 {
  int a = 25, b = 30;
  System.out.println("Value of a : "+a);
  System.out.println("Value of b : "+b);
  System.out.println("------------------");
  a += b; //a = a+b;
  System.out.println("Value of a : "+a);
  a |=b;//a = a|b;
  System.out.println("Value of a : "+a);
  
  int c = 10;
  //System.out.println(~c);//+1 == -11 //For negative values opposite the concept
  //System.out.println(c<<3); //10*(2^3)---80
  //System.out.println(c<<5); // 10*(2^5) --- 320
  System.out.println(c>>1); //10/(2^1) --- 5

  int b2 = 0b1010; //0B1010;
  System.out.println(b2);
  System.out.println(Integer.toBinaryString(b2));
  int b3 = 45;
  System.out.println(Integer.parseInt(Integer.toBinaryString(b3)));
  System.out.println(Integer.toOctalString(b3));
  System.out.println(Integer.toHexString(b3));
  
  java.util.Scanner in = new java.util.Scanner(System.in);
 /* System.out.print("Enter First Value : ");
  int i = in.nextInt();
  System.out.print("Enter Second Value : ");
  int j = in.nextInt();
  int result = (i>j)?i:j;
  System.out.println("Greater Number is : "+result);*/
  //Program to Sort Array using java.util.Arrays class 
  System.out.print("Enter Size of Array : ");
  int s = in.nextInt();
  String[] name = new String[s];
  in.nextLine();//To consume new line created by nextInt() method
  for(int k=0; k<s; k++)
  {
    System.out.print("name["+k+"] : ");
    name[k] = in.nextLine();
  }
  System.out.println("Displaying names in array-");
  for(int k=0; k<name.length; k++)
  {
    System.out.println(name[k]);
  }
  Arrays.sort(name);
  System.out.println("Displaying names in Sorted Order -");
  for(int k=0; k<name.length; k++)
  {
    System.out.println(name[k]);
  }
 }
}