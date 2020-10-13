#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[20],i,l=0;
  cin>>s;
  for(i=0;i<s[i]!='\0';i++)
    l=i;
  cout<<"The length of word "<<s<<" is "<<l+1<<endl;
  return 0;
}