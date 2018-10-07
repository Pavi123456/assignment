import java.io.*;
import java.util.*;
 
class Beginner_set3_7
{
    public bolean is ValidNumeric(String str)
    {
        str = str.trim(); 
 
        if (str.length() == 0)
            return false;
   
        if (str.length() == 1 &&
           !Character.isDigit(str.charAt(0)))
            return false;
 
    
        if (str.charAt(0)!='+' && str.charAt(0)!='-' &&
            !Character.isDigit(str.charAt(0)) &&
             str.charAt(0)!='.')
            return false;
        boolean flagDotrE = false;
 
        for (int i=1; i<str.length(); i++)
        {
           
            if (!Character.isDigit(str.charAt(i)) 
                return false;
 
            if (str.charAt(i) == '.')
            {
              
                if (flagDotOrE == true)
                    return false;
 
         
                if (i+1 >= str.length())
                    return false;
 
          
                if (!Character.isDigit(str.charAt(i+1)))
                    return false;
            }
 
            else if (str.charAt(i) == 'e')
            {
                
                flagDotOrE = true;
                if (!Character.isDigit(str.charAt(i-1)))
            
                    return false;
                if (!Character.isDigit(str.charAt(i+1)) &&
                    str.charAt(i+1) != '+' &&
                    str.charAt(i+1) != '-')
                    return false;
            }
        }
        return true;
    }
    public static void main (String[] args)
    {
        String input = "0.1e10";
        GFG gfg = new srt();
        System.out.println(gfg.isValidNumeric(input));
    }
}