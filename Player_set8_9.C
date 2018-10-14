#include <stdio.h>
int main(void) {
	int a[10],i,max,min,n,ans;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	scanf("%d",&a[i]);
	max=a[i];
	for(i=1;i<=n;i++)
	{
	if(a[i]>max)
	max=a[i];
	}
	printf("%d is the max\n",max);
            min=a[2];
            for(i=1;i<=n;i++)
            {
             if(a[i]<min)
             min=a[i];
             }
             printf("%d is the min\n",min);
             ans=max-min;
             printf("%d",ans);
             return 0;
} 