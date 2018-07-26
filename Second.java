import java.util.Scanner.*;
class Second{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num%2==0)
{
return "even";
}
else if(num%2!=0)
{
return "odd";
}
else
{
return "invalid";
}
}
