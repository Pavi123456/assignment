import java.util.*;
import java.lang.*;
import java.io.*;
class Beginner_set9_8
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int lcm=(n1>n2) ? n1 : n2;
		while(true)
		{
			if(lcm % n1 == 0 && lcm % n2 == 0)
			{
				System.out.println(lcm);
				break;
			}
			++lcm;
		}
	}
}