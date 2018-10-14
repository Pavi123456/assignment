import java.util.*;
import java.lang.*;
import java.io.*;


class pLAYER_SET7_4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int n,i,j,k=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		
		}
		for(i=0;i<n;i++){
				b[i]=sc.nextInt();
	
		}Arrays.sort(a);
		Arrays.sort(b);
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(a[i]==b[j]){
					k++;
					if(k==1)
					System.out.print(a[i]);
					else
					System.out.print(" "+a[i]);
				}
			}
		
		}
	
	}
}