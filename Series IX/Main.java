#include<iostream>
using namespace std;
int main()
{
  int n,i,a=13,b=2;
  cin>>n;
  cout<<b<<" ";
  for(i=1;i<n;i++)
  {
    int res=b+a*i;
    cout<<res<<" ";
    b=res;
  }
  return 0;
}