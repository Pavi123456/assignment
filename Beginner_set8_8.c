#include<stdio.h>
int main(void)
{
	int t;
	scanf("%d",&t);
	if(t%13==0)
	printf("%d is multiple of 13",t);
	else
	printf("%d is not multiple of 13",t);
	return 0;
}