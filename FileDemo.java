import java.io.File;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class FileDemo
{
  public static void main(String args[])
   {
      Scanner br=new Scanner(System.in);
      DateFormat sdf=new SimpleDateFormat("MMM dd,YYY hh:mm a");
      System.out.println("Enter file name");
      String Filename=br.nextLine();
      File f=new File(Filename);
      String extension=null;
      if(f.isDirectory())
      {
        System.out.println(f.getName()+"is a directory");
        System.out.println("Directory size:"+f.length()+"bytes");
        System.out.println("File last modified:"+sdf.format(f.lastModified()));
        System.out.println("List of files");
        String dir[]=f.list();
        for(int i=0;i<dir.length;i++)
        {
          System.out.println(dir[i]);
        }
   }
    else if(f.isFile())
    {
      int i=Filename.lastIndexOf(".");
      if(i>0)
      {
        extension=Filename.substring(i+1);
      }
      System.out.println("File Type:"+extension);
      System.out.println(f.getName()+":is a file");
      if(f.canRead())
      {
         System.out.println(Filename+"is readable");
      }
      else
      {
         System.out.println(Filename+" is not readable");
      }
      if(f.canWrite())
        System.out.println(Filename+" is Writable");
        else
      { 
       System.out.println(Filename+"is not writable");
      }
        System.out.println("File size is "+f.length()+"bytes");  
        System.out.println("Last modified :"+sdf.format(f.lastModified()));  
      }  
      else
      {
        System.out.println(f.getName()+"File does not exist");
      }
   }
}

        
