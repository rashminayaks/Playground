#include<iostream>
using namespace std;
int fact(int n);
int main()
{
int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
  return 0;
}
int fact(int n)
{
  if(n==0||n==1)
    return 1;
return n*fact(n-1);
}