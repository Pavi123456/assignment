import java.util.*;
import java.lang.*;
import java.io.*;


class Player_set5_10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();boolean st=false;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
			st=true;
			break;
				
			}
		}
		if(st)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}