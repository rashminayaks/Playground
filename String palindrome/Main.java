#include<iostream>
using namespace std;
int main()
{
  char s1[20],s2[20];
  cin>>s1;
  int len=0,i,flag=0;
  for(i=0;s1[i]!='\0';i++)
    len++;
  int end=len-1;
  for(i=0;i<len;i++)
  {
    s2[i]=s1[end];
  end--;
  }
  for(i=0;s1[i]!='\0';i++)
  {
    if(s1[i]==s2[i])
    flag=1;
    else
      flag=0;
  }
 (flag==1)?cout<<"Palindrome":cout<<"Not a Palindrome";
  return 0;
}