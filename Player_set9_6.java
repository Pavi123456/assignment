import java.util.*;
import java.lang.*;
import java.io.*;


classPlayer-set9_6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int y=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
		             y=a[i]^a[j];
			}
		}
		System.out.println(y);
		

				
				
				
				
				
				
				
				
				
			}
}