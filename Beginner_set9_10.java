import java.util.*;
import java.lang.*;
import java.io.*;


class Beginner_set9_10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		String s,n;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		n=s.replaceAll("[^0-9]","");
		System.out.print(n);
	}
}