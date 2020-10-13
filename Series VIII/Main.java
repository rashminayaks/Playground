#include<iostream>
using namespace std;
int main()
{
  int n,i,a=4;
  cin>>n;
    cout<<a<<" ";
  for(i=1;i<n;i++)
  {
    int res=a+(i*i);
    cout<<res<<" ";
    a=res;
  }
  return 0;
}