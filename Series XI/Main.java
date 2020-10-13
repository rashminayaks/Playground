#include<iostream>
using namespace std;
int main()
{
  int n,i;
  float a=95,val=20.5;
  cin>>n;
  cout<<a<<" ";
  for(i=1;i<n;i++)
  {
      a=a+val;
      cout<<a<<" ";
      val+=2;
    }
    return 0;
  }