//Program to show use of ByteArrayInputStream & ByteArrayOutputStream
import java.io.*;
class ByteArray
{
  public static void main(String arr[])
  {
    try
     {
       ByteArrayOutputStream bout = new ByteArrayOutputStream();
       String contents = "Hello, check this data";
       bout.write(contents.getBytes(),0,contents.length());
      

ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
     
       int ch;
      /* while(true)*/  while((ch=bin.read())!=-1)
       {
          /*ch = bin.read();
          if(ch==-1)
          break;*/
          System.out.print((char)ch);
       }
     }catch(Exception e)
      {
        e.printStackTrace();
      }
  }
}