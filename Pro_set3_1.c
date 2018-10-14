#include<stdio.h>
void main()
{
	int n,i,a[100],x=0,y=0,j;
	scanf("%d",&n);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		x=x+a[i];
		for(j=i+1;j<n;j++)
		{
			y=y+a[j];
		}
		if((x/(i+1))==(y/(n-i-1)))
		{
			printf("YES");
			break;
		}
		y=0;
	}
}