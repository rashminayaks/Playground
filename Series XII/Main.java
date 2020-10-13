#include<iostream>
using namespace std;
int main()
{
  int n,i,a=9,b=11,sum=0;
  cin>>n;
  if(n==1)
  cout<<a;
  else
  {
    cout<<a<<" "<<b<<" ";
    for(i=0;i<n-2;i++) 
    {
   sum=a+b;
      cout<<sum<<" ";
      a=b;
      b=sum;
    }
  }
  return 0;
}