import java.io.*;
import java.util.*;
  public class Beginner_set9_1{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
       int kc[]=new int[3];
	     int oc[]=new int[3];
      System.out.println("Enter The Inputs");
      for(int i=0;i<3;i++)
      {
        System.out.print("Kabali's Clan Members:");
        kc[i]=sc.nextInt();
        System.out.print("opponent's Clan Members:");
        oc[i]=sc.nextInt();
      }
      System.out.println("-------------------------");
     for(int j=0;j<3;j++)
     {
     if(kc[j]>oc[j])
     {
     System.out.println("Difference-->"+(kc[j]-oc[j]));
     }
     else{
     System.out.println("Kabali's Clan members Should Greater than Opponent.");
     }
     }
    }
} 