import java.util.Arrays;
import java.util.Scanner;
 class Beginner_set9_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       String n=sc.next();
       char ch[]=n.toCharArray();
       Arrays.sort(ch);
       String m="";
       for(int i=0;i<char.length;i++)
       {
    	 m+=ch[i];  
       }
       System.out.printf(m);
	}

}