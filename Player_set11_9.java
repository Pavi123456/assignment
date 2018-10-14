import java.util.*;
public class Player_set11_9 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,sum=0;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=n-1;i>=0;i--){
	sum=sum+arr[i];
	System.out.print(sum+" ");
}
}
}
