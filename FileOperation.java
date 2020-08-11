package filehandling;

import java.io.File;
import java.io.IOException;

public class FileOperation 
{
    public static void main(String[] args) throws IOException
     {
      File f = new File("D:\\Java5.30\\MyOwnFile.txt");
      if(f.exists())
      {
         System.out.println(f.toString()+" Exists in the "
                 + "directory!");
      }
      else
      {
        System.out.println(f.toString()+" Not Exists in the "
                 + "directory!");  
        if(f.createNewFile())
        {
          System.out.println(f.toString()+" is created successfully!");  
        }
        else
        {
          System.out.println(f.toString()+" is not created!");
        }
        
      }
      System.out.println("Getting Absolute path of the File "
              + "Object -");
      String absolutePath = f.getAbsolutePath();
      System.out.println(absolutePath);
      
      String relativePath = new File("Java5.30\\MyOwnFile.txt").getPath();
      System.out.println("Relative Path : "+relativePath);
      
      String canonicalPath = new File("D:/Java5.30/MyOwnFile.txt").getCanonicalPath();
      System.out.println("Canonical Path : "+canonicalPath);
      
      
      File file = new File("D:\\Java5.30\\Checked.java");
      if(file.isDirectory())
      {
          System.out.println(file.toString()+" is a Directory!");
      }
      else
      {
          System.out.println(file.toString()+" is a file!");
      }
      System.out.println("Size of File/Folder : "+(((file.getTotalSpace())/1024)/1024)/1024+" GB.");
      System.out.println("Free Space : "+((file.getFreeSpace()/1024)/1024)/1024+" GB.");
    
     File myfile = new File("D:\\Java5.30");
     String[] files = myfile.list();
     for(String a : files)
     {
       System.out.println(a);  
     }
     File myfiles = new File("D:\\Java5.30\\MyOwnFile.txt");
     //System.out.println(myfiles.exists());
     if(myfiles.exists())
     {
         if(myfiles.delete())
         {
          System.out.println("File is deleted.");   
         }
         else
         {
           System.out.println("Can't delete.");
         }
     }
     else
     {
         System.out.println("File does not exists!");
     }
     }
    
    
}
