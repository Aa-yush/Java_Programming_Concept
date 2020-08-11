//Program to show need of synchronization in java
import java.io.*;
class DataReader
{
 BufferedReader br;
 public DataReader()
 {
  br = new BufferedReader(new InputStreamReader(System.in));
 }
 public String readData(String msg)
 {
  try
   {
    System.out.println(msg);
    return br.readLine();
   }catch(IOException e)
    {
      return "Error in I/O operation.";
    }
 }
}