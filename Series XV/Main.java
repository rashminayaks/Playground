#include<iostream>
using namespace std;
int main()
{
  int i,n,a=3,b=8,v;
  cin>>n;
  cout<<a<<" "<<b<<" ";
  for(i=1;i<n-1;i++)
  {
    v=a+b+(i+1);
    cout<<v<<" ";
    a=b;
    b=v;
  }
  return 0;
}