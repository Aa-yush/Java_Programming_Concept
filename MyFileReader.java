//Reading contents of File using Character oriented stream
import java.io.*;
import java.util.Date;
class MyFileReader
{
  public static void main(String arr[])
  {
   try
    {
     FileReader fr = new FileReader(arr[0]);
     int ch;
     Date d1 = new Date();
     while((ch=fr.read())!=-1)
     {
       System.out.print((char)ch);
     }
     Date d2 = new Date();
     long time = d2.getTime() - d1.getTime();
     System.out.println("\n"+arr[0]+" is successfully read in "+time+" milliseconds.");
    }catch(IOException e)
     {
       e.printStackTrace();
     }
  }
}