import java.util.Scanner;

public class Program3 {
	
	   public static void main(String args[])
	   {
	      int x, y, temp;
	      System.out.println("enter the value of x and y");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	 
	      
	 
	      temp = x;
	      x = y;
	      y = temp;
	 
	      System.out.println(x+"\n"+y);
	   }
	}

