import java.util.Scanner;

public class Weer {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		
		String test = sc.nextLine();
		System.out.println(test.replace(" ", "").length());

	}

}
