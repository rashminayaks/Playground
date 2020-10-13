#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,i,c=0;
  cin>>n;
  for(i=0;i<n-2;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  cout<<c;
  return 0;
}