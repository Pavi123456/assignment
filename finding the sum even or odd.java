import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		if(sum%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}

	}

}
