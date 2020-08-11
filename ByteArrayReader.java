//Program to show use of ByteArrayInputStream
import java.io.*;
class ByteArrayReader
{
  public static void main(String arr[])
  {
    try
     {
       //byte[] b = {65,66,67,68,69,70,71,72,73,74,75};
       byte[] b = {1,2,3,4,5,6,7,8,9,10,35,36,37,38};
       ByteArrayInputStream bin = new ByteArrayInputStream(b);
      // String data = "Hello, how are you!";
       //ByteArrayInputStream bin = new ByteArrayInputStream(data.getBytes());
       int ch;
       while(true)
       {
          ch = bin.read();
          if(ch==-1)
          break;
          //System.out.print((char)ch+"  ");
          System.out.print((char)ch+"   ");
       }
     }catch(Exception e)
      {
        e.printStackTrace();
      }
  }
}