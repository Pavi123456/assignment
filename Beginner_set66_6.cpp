#include <iostream>
using namespace std;

int main() {
    int count=0,count1=0,i;
	char str[100];
	cin>>str;
	for(i=0;str[i]!=0;i++)
	{
	    if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
	    {
	        count++;
	    }
	    if(str[i]>='0' && str[i]<='9')
	    {
	        count1++;
	    }
	}
	    if(count>=1 && count1>=1)
	    {
	        cout<<"yes";
	    }
	    else
	    {
	        cout<<"no";
	    }
	return 0;
}