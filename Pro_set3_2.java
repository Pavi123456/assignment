import java.util.*;
public class Pro_set3_2 {

	public static void main(String[] args) {
		int sum = 0;		
		Scanner x = new Scanner(System.in);
		int size = x.nextInt();
		int a[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i] = x.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			if(j%2==0)
			{
				sum = sum + a[j];
			}  
		}
		System.out.println(sum);
	}

}