import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class Line
{   
    public static void main(String[] args) 
    {
        BufferedReader reader = null;
         
        int lineCount = 0;
         
        try
        {
        
             
            reader = new BufferedReader(new FileReader("C:\\sample.txt"));
             
        
             
            String currentLine = reader.readLine();
             
            while (currentLine != null)
            {
        
                 
                lineCount++;
                 
                         
                String[] words = currentLine.split(" ");
                 
                         
        
                 
                       
                for (String word : words)
                {
        
                     
             
                }
                 
           
                 
                currentLine = reader.readLine();
            }
             
            
             
            System.out.println("Number Of Lines In A File : "+lineCount);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();        
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}