#include<iostream>
using namespace std;
int main()
{
 int n,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    int res;
    if(i%2!=0)
    {
      res=(i*i)-1;
      cout<<res<<" ";
    }
    else
    {
      res=(i*i)-2;
      cout<<res<<" ";
    }
  }
  return 0;
}