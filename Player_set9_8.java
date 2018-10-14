import java.util.*;
import java.lang.*;
import java.io.*;


class player_set9_8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		double re=n>>k;
		System.out.print("%.2f",re);
	}
}