//Program to read data from any file using BufferedReader 
import java.io.*;
import java.util.*;
class MyReader
{
  public static void main(String arr[])
  {
    try
    {
      BufferedReader fname = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter File name with location : ");
     String file = fname.readLine();

     BufferedReader br = new BufferedReader(new FileReader(file));

    // BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
     String str = null;
     Date d1 = new Date();
     while((str=br.readLine())!=null)
     {
        System.out.println(str);
      }
      Date d2 = new Date();
      long time = d2.getTime() - d1.getTime();
      System.out.println("\n"+file+" is successfully read in "+time+" milliseconds.");
    }catch(IOException e)
     {
       e.printStackTrace();
     }
  }
}