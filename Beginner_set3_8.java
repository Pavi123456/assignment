import java.util.Scanner;
class Beginner_set3_8
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc. nextInt();
}
for(int i=0;i<n;i++)
{
	System.out.println("\n"+a[i]+" "+i);
}
}
}