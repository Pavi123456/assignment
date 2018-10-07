import java.util.Scanner;
public class Player_set2_1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		s=sc.next().toLowerCase();
		if(s.equals("sunday") || s.equals("saturday")) 
			System.out.println("yes");
		
		else 
			System.out.println("no");
		
	}
}