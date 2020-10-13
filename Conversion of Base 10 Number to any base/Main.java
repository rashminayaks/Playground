#include<iostream>
using namespace std;
int base(int n,int b);
int main()
{
  int n,b;
  cout<<"Enter the value of n "<<endl;
  cin>>n;
  cout<<"Enter the base to which you want to convert "<<endl;
  cin>>b;
  int res=base(n,b);
  cout<<"The number in base "<<b<<" is "<<res<<endl;
  return 0;
}
int base(int n,int b)
{
if((n==0)||(b==10))
  return 0;
  return (n%b)+10*base(n/b,b);
}