import java.io.*;
import java.util.*;
  public class Beginner_set11_7{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter N value");
      int n=sc.nextInt();
      System.out.println("Enter K value");
      int k=sc.nextInt();
      int na[]=new int[n];
      int count=0;
      System.out.println("Enter Elements:");
      for(int i=0;i<n;i++)
      {
      na[i]=sc.nextInt();
      }
      int min=na[0];
      for(int j=0;j<n;j++)
      {
      if(min<na[i])
      {
      count++;
      if(count==k)
      {
        System.out.println("Kth Position MIN Number is->"+na[j-1]);
      }
      }
      }
    }
}