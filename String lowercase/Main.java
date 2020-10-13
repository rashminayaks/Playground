#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 char s[20];
  int i;
  cin>>s;
  for(i=0;s[i]!='\0';i++)
  {
    if((s[i]>='A') && (s[i]<='Z'))
      s[i]=s[i]+32;
  }
  cout<<"The output string is "<<s;
  return 0;
}