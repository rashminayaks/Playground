#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s1[20],s2[20];
  cin>>s1>>s2;
  cout<<"The concatenated string is "<<strcat(s1,s2)<<endl;
  return 0;
}