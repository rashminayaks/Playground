#include<iostream>
using namespace std;
int sum(int n);
int main()
{
 int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  int res=sum(n);
  cout<<"The sum of digits in "<<n<<" is "<<res;
  return 0;
}
int sum(int n)
{
  if(n>=0 && n<=9)
    return n;
  else
  return (n%10)+sum(n/10);
}