#include <stdio.h>
int main(void) {
     int a[5],i,first,second;
     for(i=1;i<=5;i++)
     scanf("%d",&a[i]);
     first=a[1];
     for(i=1;i<=5;i++)
     if(a[i]<first)
     {
     first=a[i];
     }
     second=a[2];
     for(i=1;i<=5;i++)
     if((a[i]<second)&&(a[i]>first))
     {
     second=a[i];
     }
      printf("%d",second);
	return 0;
}