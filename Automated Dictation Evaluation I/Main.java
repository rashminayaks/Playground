#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 char s1[20],s2[20];
  cin>>s1>>s2;
  if(strcmp(s1,s2)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}