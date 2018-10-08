#include<stdio.h>
int main()
{
int number,k,i,mul=1,count=0;
printf("enter the number and k value");
scanf("%d\t%d",&number,&k);
for(i=1;i<=number;i++)
{
mul*=k;
if(mul==number)
{
  printf("yes");
  break;}
}
return 0;
}