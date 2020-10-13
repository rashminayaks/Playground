#include<iostream>
using namespace std;
int fib(int n);
int main()
{
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n-1)<<endl;
  return 0;
}
int fib(int n)
{
  if((n==0) || (n==1))
    return n;
  else
    return fib(n-1)+fib(n-2);
}