import java.io.*;

/**
   This program creates a list of songs for a CD
   by reading from a file.
*/

public class CompactDisc
{
   public static void main(String[] args)throws IOException
   {
      FileReader file = new FileReader("Classics.txt");
      BufferedReader input = new BufferedReader(file);
      String title = null;
      String artist = null;
      // ADD LINES FOR TASK #3 HERE
 
      // Declare an array of Song objects, called cd,
     
      // with a size of 6
      String[] cd = new String[6];
      
      
      
      for (int i = 0; i < cd.length; i++)
      {
    	  
    	  
         
         // ADD LINES FOR TASK #3 HERE
         // Fill the array by creating a new song with
    	  Song a= new Song(title, artist);
         
         // the title and artist and storing it in the
    	  title=input.readLine();
    	  artist=input.readLine();
         // appropriate position in the array
    	  cd[i]=a.toString();
      }

      System.out.println("Contents of Classics:");
      for (int i = 0; i < cd.length; i++)
      {
         // ADD LINES FOR TASK #3 HERE
    	  System.out.println(cd[i]);
         // Print the contents of the array to the console
      }
   }
}