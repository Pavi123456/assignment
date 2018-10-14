#include<stdio.h>
int main()
{
	int N,K,num[10],i;
	scanf("%d%d",&N,&K);
	for(i=0;i<N;i++)
	scanf("%d",&num[i]);
	for(i=0;i<N;i++)
	if(num[i]==K)
	printf("Yes");
	return 0;
}