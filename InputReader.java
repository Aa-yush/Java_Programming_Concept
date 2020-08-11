//Program to take input by user with io package
import java.io.*;
class InputReader
{
 public static void main(String arr[])
 {
  try
  {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.print("Enter any numeric value : ");
   int n = Integer.parseInt(br.readLine());
   if(n%2==0)
   System.out.println(n+" is an even number.");
   else
   System.out.println(n+" is an odd number.");
   System.out.println("Enter your name please : ");
   String name = br.readLine();
   System.out.println("Well done "+name+"! You have completed the task."); 
  }catch(IOException|NumberFormatException e)
   {
     e.printStackTrace();
   }
 }
}