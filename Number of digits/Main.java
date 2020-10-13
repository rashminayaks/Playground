#include<iostream>
using namespace std;
int sum(int n);
int main()
{
 int n,c=0;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  int res=sum(n);
  cout<<"The number of digits in "<<n<<" is "<<res;
  return 0;
}
int sum(int n)
{
  static int c=0;
  if(n>0)
  {
    c++;
    sum(n/10);
  }
  else
  {
 return c;
  }
}