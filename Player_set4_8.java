import java.util.*;
import java.lang.*;
import java.io.*;
class Player_set4_8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			if(i%2!=0)
		System.out.print(i+" ");
			}
		}
		
	}
}