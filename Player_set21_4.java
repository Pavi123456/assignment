import java.util.ArrayList;
public class Player_set21_4{
  public static void main(String aa[]){
     Scanner s=new Scanner(System.in);
     String h=s.nextLine();
     for(int i=0;i<h.length();i++){
         if(Character.isUpperCase(h.charAt(i))){
             System.out.print(Character.toLowerCase(h.charAt(i)));
         }
         if(Character.isLowerCase(h.charAt(i))){
             System.out.print(Character.toUpperCase(h.charAt(i)));
         }
     }
}
}