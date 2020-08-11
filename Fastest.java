//Program to read contents of data in one go i.e. fastest way of reading data from file
import java.io.*;
import java.util.*;
class Fastest
{
  public static void main(String arr[])
  {
    try
    {
      FileInputStream fin = new FileInputStream(arr[0]);
      byte[] b = new byte[fin.available()];
      Date d1 = new Date();
      fin.read(b); 
      String str = new String(b);
      System.out.println(str);
      Date d2 = new Date();
      long time = d2.getTime() - d1.getTime();
      System.out.println("\n"+arr[0]+" is successfully read in "+time+" milliseconds.");
    }catch(IOException e)
     {
       e.printStackTrace();
     }
  }
}