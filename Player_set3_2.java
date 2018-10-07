import java.util.*;
import java.io.*;
public class Player_set3_2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,n1,i;
		n=sc.nextInt();
		n1=sc.nextInt();
		
		for(i=2;i<n1;i++)
		{
			if(n%i==0&&n1%i==0)
			break;
		}
	System.out.println(i);
	}
}