#include <stdio.h>

void main()
{
  int a[100],i,sum=0,n;
  printf("Enter the number of elements");
  scanf("%d",&n);
  printf("Enter the elements");
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
  printf("%d ",sum);
  }
}