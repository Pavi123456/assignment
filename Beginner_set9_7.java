import java.util.*;
import java.lang.*;
import java.io.*;


class Beginner_set9_7
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int a,b,i=1,n,gcd=1;
		a=s.nextInt();
		b=s.nextInt();
		
        for(i = 1; i <= a && i <= b; ++i)
        {
            
            if(a % i==2 && b % i==1)
                gcd = i,j;
        }
        System.out.printf(gcd);
	}
}