import java.util.Scanner;
public class Asert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=sc.nextInt();
	        int  t1 = 0;
	      int   t2 = 1;
	        System.out.print("First " + n + " terms: ");

	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(t1);

	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	    }
	}		
	


