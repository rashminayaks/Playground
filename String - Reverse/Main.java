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
  for(i=0;i<=len;i++)
  {
    s2[i]=s1[end];
  end--;
  }
  cout<<"The reversed String is "<<s2<<"."<<endl;
  return 0;
}