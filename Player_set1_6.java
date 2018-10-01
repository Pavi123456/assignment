import java.util.HashMap;  
import java.util.Scanner;  
  

public class Player_set1_6 {  
  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        String string1 = sc.next();  
        String string2 = sc.next();  
        System.out.println("Given strings are "+ (checkIsomorphic(string1, string2)?"Isomorphic":"Not Isomorphic"));  
  
    }  
  
    /** 
     * This method returns boolean identifying String Isomorphic. 
     *  
     * @param string1 
     * @param string2 
     * @return 
     */  
    private static boolean checkIsomorphic(String string1, String string2) {  
        if (string1.length() != string2.length())  
            return false;  
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();  
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();  
  
        for (int i = 0; i < string1.length(); i++) {  
            char c1 = string1.charAt(i);  
            char c2 = string2.charAt(i);  
            if (map1.containsKey(c1)) {  
                if (map1.get(c1) != c2)  
                    return false;  
            }  
            if (map2.containsKey(c2)) {  
                if (map2.get(c2) != c1)  
                    return false;  
            }  
  
            map1.put(c1, c2);  
            map2.put(c2, c1);  
        }  
        return true;  
    }  
}  