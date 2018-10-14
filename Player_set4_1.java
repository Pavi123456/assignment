import java.util.*;
import java.lang.*;
import java.io.*;


class Player_set4_1

{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count1=0,count2=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			count1++;
			if(str.charAt(i)==')')
			count2++;
		}
		if(count1==count2)
		 System.out.println("yes");
		else
		 System.out.println("no");
		}
	}
}