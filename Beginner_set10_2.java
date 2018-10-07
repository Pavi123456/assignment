import java.io.*;
import java.util.*;
  public class Beginner_set10_2{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter N value:");
      int n=sc.nextInt();
      int a[]=new int[n];
      int sum=0;
      System.out.println("Enter The Elements:");
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int j=0;j<n;j++)
      {
        sum=sum+a[j];
      }  
     System.out.println("SUM:"+sum);
    }
} 