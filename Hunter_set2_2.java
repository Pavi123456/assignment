import java.util.Scanner;

public class Hunter_set2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        System.out.print("Enter k :");
        int k= s.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.println("the elements:"+a[k-1]);
        

	}

}