import java.util.Arrays;
import java.util.Scanner;
class Beginner_set9_6 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char s1[]=s.toCharArray();
		int count=0;
		String a="";
		int l=s.length();
		for(int i=0;i<s1.length;i++){
			for(int j=i+1;j<s1.length;j++){
				if(s1[i]==s1[j]){
					count++;
				}
		}
		}
		if(count==0)
		System.out.println("YES");
		else
			System.out.println("NO");
	}
}