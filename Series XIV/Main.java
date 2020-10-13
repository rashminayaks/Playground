#include<iostream>
using namespace std;
int main()
{
 int n,i,a=2,b=5,d,val;
  cin>>n;
  cout<<a<<" "<<b<<" ";
  for(i=0;i<n-2;i++)
  {
    d=b-a;
    val=b+(d*2);
    cout<<val<<" ";
    a=b;
    b=val;
  }
  return 0;
}