

public class GFG { 
       
    static final int MAX_CHAR = 26; 
  
   
    static boolean arekAnagrams(String str1, String str2,  
                                                 int k) 
    { 
        
        int n = str1.length(); 
        if (str2.length() != n) 
            return false; 
  
        int[] count1 = new int[MAX_CHAR]; 
        int[] count2 = new int[MAX_CHAR]; 
        int count = 0; 
         
       
        for (int i = 0; i < n; i++) 
            count1[str1.charAt(i) - 'a']++; 
        for (int i = 0; i < n; i++) 
            count2[str2.charAt(i) - 'a']++; 
  
        
        
        for (int i = 0; i < MAX_CHAR; i++) 
            if (count1[i] > count2[i]) 
                count = count + Math.abs(count1[i] -  
                                          count2[i]); 
  
       
        return (count <= k); 
    } 
  
    
    public static void main(String args[]) 
    { 
        String str1 = " aaa "; 
        String str2 = "  aaB "; 
        int k = 2; 
        if (arekAnagrams(str1, str2, k)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 

