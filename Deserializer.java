//Program to deserialized any serialized object
import java.io.*;
class Deserializer
{
 public static void main(String arr[])
 {
  try
   {
    System.out.println("Deserializing objects....");
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.data"));
    Employee e1 = (Employee)in.readObject();
    Employee e2 = (Employee)in.readObject();
    Employee e3 = (Employee)in.readObject();
    System.out.println("Following objects are recreated...");
    e1.showRecords();  e2.showRecords();  e3.showRecords();
   }catch(IOException|ClassNotFoundException e)
    {
     e.printStackTrace();
    }
 }
}