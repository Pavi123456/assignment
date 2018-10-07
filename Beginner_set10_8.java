import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Beginner_set10_8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int s=in.nextInt();
		int s[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();https://ideone.com/
		}
		int p=0,c=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					p=i;
					c=1;
				}
			}
		}
		if(c==0)
		System.out.println(n/2);
		else
		System.out.println(p+1);
	}
}