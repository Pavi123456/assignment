import java.util.*;
public class Player_set9_2{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,temp,and=0;
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=in.nextInt();
}
for(int i=0;i<n-1;i++){
	for(int j=i+1;j<n;j++){
	and=a[i]&a[j];
}}
System.out.println(and);
}
}