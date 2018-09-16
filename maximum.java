import java.util.Scanner;
public class Program {
		public static void main(String argn[]){
		Scanner data = new Scanner(System.in);
		int num, i, temp, max;
		
		System.out.print("Enter number you want to enter:");
		num = data.nextInt();
		System.out.println("Enter " +num+ " number");
		
		max = data.nextInt();
		
		for (i=1; i < num; i++) { temp = data.nextInt();
		 if(temp < max)
		continue;
		else

		max = temp;
		}
		System.out.println("Largest Number is "+max);
		}
		}