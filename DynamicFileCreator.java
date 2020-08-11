//Program to create any file using java io which name is provided by user with it's extension
import java.io.*;
class DynamicFileCreator
{
 public static void main(String[] arr)
 {
  try
   {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //PrintStream out = new PrintStream(new FileOutputStream(arr[0]));

    FileOutputStream fout = new FileOutputStream(arr[0]);
    /*FileWriter fwriter = new FileWriter(arr[0]);
    BufferedWriter bwriter = new BufferedWriter(fwriter);*/
    String str = null;
    System.out.println("Please write contents to file, write save to save and exit....");
    while(true)
    {
     str = br.readLine();
     if(str.equalsIgnoreCase("save"))
     {
       break;
     }
     //out.println(str);
     fout.write(str.getBytes());
    // bwriter.write(str);
    }
    System.out.println("\n"+arr[0]+" is successfully created and saved!");
   }catch(Exception e)
    {
     e.printStackTrace();
    }
 }
}