#include<iostream>
using namespace std;
int binary(int n);
int main()
{
 int n;
  cin>>n;
  int res=binary(n);
  cout<<res;
  return 0;
}
int binary(int n)
{
  if(n==0)
    return 0;
  else
   return (n%2)+10*binary(n/2);
}