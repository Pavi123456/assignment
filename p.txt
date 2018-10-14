#include<stdio.h>
int main(void)

{

	int b,h,a,i,c=0;
	scanf("%d%d",&b,&h);
	for(i=b;i<=h;i++)
	{
		if(i%2!=0)
		{
			c=c+i;
		}
	}
	printf("%d\t",c);
return 0;
}