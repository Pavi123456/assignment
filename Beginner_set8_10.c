#include <stdio.h>
int main(void)
{
 int a=10,i;
 char s[300];
 gets(s);
 
 for(i=0;i<=a;i++)
 {
     printf("%c",s[i]);
 }
 return 0;
}