import java.io.*;
import java.util.*;
  public class Beginner_set10_4{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter N value:");
      int n=sc.nextInt();
      System.out.println("Enter K value:");
      int k=sc.nextInt();
      int narr[]=new int[n];
	  System.out.println("Enter ELEMENTS");
      for(int i=0;i<n;i++)
      {
      narr[i]=sc.nextInt();
      }
      System.out.println("K-->"+(narr[k-1]));
     }
} 