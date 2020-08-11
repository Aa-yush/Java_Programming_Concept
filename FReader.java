//Program to use Byte oriented input stream to read contents from any given file
import java.io.*;
import java.util.Date;
import java.util.Scanner;
class FReader
{
  public static void main(String arr[])
  {
    try
    {
     // FileInputStream fin = new FileInputStream(arr[0]);
      Scanner in = new Scanner(System.in);
      System.out.print("Enter Name and location of file : ");
      String location = in.nextLine();

      FileInputStream fin = new FileInputStream(location);
      int ch;
      Date d1 = new Date();
      while(true)
      {
        ch = fin.read();
        if(ch==-1)
        break;
        System.out.print((char)ch);
      }
      Date d2 = new Date();
       long time = d2.getTime() - d1.getTime();
     System.out.println("\nFile Reading is completed successfully with in "+time+" milliseconds.");
    }catch(IOException e)
     {
       e.printStackTrace();
     }
  }
}