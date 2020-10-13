#include<iostream>
using namespace std;
int main()
{
  int n,i,a=11;
  cin>>n;
  for(i=0;i<n;i++)
  {
  int res=a*a;
    cout<<res<<" ";
    a=a+4;
  }
  return 0;
}