//Program to read content of two given files and copy it into another file
import java.io.*;
class Copier
{
 public static void main(String arr[])
 {
  try
   {
    SequenceInputStream sis = new SequenceInputStream(new FileInputStream(arr[0]),new FileInputStream(arr[1]));
    FileOutputStream fout = new FileOutputStream(arr[2]);
    int ch;
    System.out.println("Following contents are going to copy...");
    while(true)
    {
      ch = sis.read();
      if(ch==-1)
      break;
      System.out.print((char)ch);
      fout.write(ch);
     }
     System.out.println("\nContents of "+arr[0] +" and "+arr[1]+" are successfully copied to "+arr[2]);
   }catch(Exception e)
    {
     e.printStackTrace();
    }
 }
}