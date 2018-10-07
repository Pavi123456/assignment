#include<iostream.h>
void main()
{
 int n,i,j,num,min;
 int a[100];
 cin>>n;
 for(i=0;i<n;i++)
 {
  cin>>a[i];
 }
 for(i=0;i<n;i++)
 {
  int count=0;
  for(i=0;i<n;i++)
  {
   if(a[i]==a[j])
   {
    count=count+1;
   }
  }
  if(count==0)
  {
   cout<<a[i];
  }
 }
} 