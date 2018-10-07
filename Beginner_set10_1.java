import java.util.*;
import java.lang.*;
import java.io.*;

class Beginner_set10_1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int h=s.nextInt();
		int b=s.nextInt();
		int area=l*h+h*b+b*l;
		int volume=l*b*h;
		System.out.print(2*area+" "+volume);
	}
}