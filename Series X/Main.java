#include<iostream>
using namespace std;
int main()
{
 int n,i,a=2;
  cin>>n;
  cout<<a<<" ";
  for(i=1;i<n;i++)
  {
    int b=(a*a)-1;
    cout<<b<<" ";
    a=b;
  }
  return 0;
}