#include<iostream>
using namespace std;
int power(int a,int n);
int main()
{
 int n,a;
  cout<<"Enter the value of a"<<endl;
    cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  int res=power(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<res;
  return 0;
}
int power(int a,int n)
{
  if(n==0)
    return 1;
  else
    return a*power(a,n-1);
}