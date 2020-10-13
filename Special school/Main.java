#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s1[20],s2[20],s3[20];
  cin>>s3>>s1;
  int len=0,i;
  for(i=0;s1[i]!='\0';i++)
    len++;
  int end=len-1;
  for(i=0;i<=len;i++)
  {
    s2[i]=s1[end];
  end--;
  }
  if(strcmp(s2,s3)==0)
 cout<<"It is correct";
  else
  cout<<"It is wrong";
  return 0;
}