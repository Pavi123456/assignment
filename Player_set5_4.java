import java.util.Scanner;

public class Player_set5_4{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.equals(s2)) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
	
}