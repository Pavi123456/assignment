import java.util.*;
public class Player-set4_4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		for(int i=0;i<str.length();i++) {
			if(i%3==0) {
				System.out.print(str.charAt(i));
			}
		}
	}

}