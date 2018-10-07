import java.util.*;
import java.lang.*;
import java.io.*;
class Beginner_set10_5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int t=sc.nextInt();
		int r=sc.nextInt();
		int si=(p*t*r)/100;
		System.out.println((int)Math.floor(si));
	}
}