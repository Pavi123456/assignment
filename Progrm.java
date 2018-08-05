import java.util.Scanner;

public class P7 {

		public static void main(String[] args) {
			System.out.println("enter the number");
			Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
	        int number, temp, total = 0;

	        number = num;
	        while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }

	        if(total == num)
	            System.out.println("yes");
	        else
	            System.out.println("no");
	    }

	}


