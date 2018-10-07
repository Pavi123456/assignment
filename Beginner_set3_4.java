import java.util.*;
public class Beginner_set3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]=new int[20];
   int n,i,j,temp;
   System.out.println("Enter the number");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     System.out.println("Enter the values");
     for(i=0;i<n;i++)
     {
    	a[i]=sc.nextInt();
     }
    for(i=0;i<n;i++)
    {
    	for(j=i;j<n;j++)
    		
    	{
    		if(a[i]>a[j])
    		{
    		    temp=a[j];
    			a[j]=a[i];
    			a[i]=temp;	
    		}
    	}
    }
    System.out.println("The sorted list is");
    for(i=0;i<n;i++)
    {
    	System.out.println(a[i]);
    }
	}

}