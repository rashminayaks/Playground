#include<iostream>
using namespace std;
int main()
{
  char s[20];
  cin>>s;
  int count=0;
for(int i=0;s[i]!='\0';i++)
{
  if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
    count++;
  else  if(s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
    count++;
}
  cout<<"Number of vowels: "<<count;
  return 0;
}