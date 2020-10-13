#include<iostream>
using namespace std;
int main()
{
  int t=1,num=0,i,n;
  cin>>n;
  cout<<"1"<<" ";
  for(i=1;i<=n-1;i++)
  {
    if(t%2!=0)
    {
      num=t*2;
      cout<<num<<" ";
    }
    else
    {
      num=(t*3)/2;
        cout<<num<<" ";
    }
    t=num;
  }
    return 0;
}