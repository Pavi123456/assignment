#include <stdio.h>
#include<math.h>
int main()
{
    int a,n,d;
int sum;
printf("enter the values of a,d,n");
scanf("%d%d%d",&a,&d,&n);
sum=a+(a+(n-1)*d);
printf("sum of AP series is %d",sum);

    return 0;
}