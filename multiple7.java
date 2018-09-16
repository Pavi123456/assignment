
import java.io.*; 
  
class Multiple
{ 
    
    static boolean isDivisibleBy7(int num) 
    { 
        
        if( num < 0 ) 
            return isDivisibleBy7( -num ); 
   
       
        if( num == 0 || num == 7 ) 
            return true; 
        if( num < 10 ) 
            return false; 
   
      
        return isDivisibleBy7( num / 10 - 2 * ( num - num / 10 * 10 ) ); 
    } 
      
 
    public static void main (String[] args)  
    { 
        int num = 616; 
        if(isDivisibleBy7(num)) 
            System.out.println("yes"); 
        else
            System.out.println("No"); 
    } 
} 