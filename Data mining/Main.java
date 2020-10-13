#include<iostream>
using namespace std;
int main()
{
  int n,s1,s2;
  cin>>n;
  while(n!=0)
  {
    int digit=n%10;
    n=n/10;
    if(digit%2==0)
      s1+=digit;
    else
      s2+=digit;
  }
  if(s1==s2)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}