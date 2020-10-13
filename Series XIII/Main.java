#include<iostream>
using namespace std;
int main()
{
  int n,i,num=5,val=11,c=1;
  cin>>n;
  cout<<num<<" ";
  for(i=0;i<n-1;i++)
  {
    num+=val;
    cout<<num<<" ";
    c+=2;
    val=11*c;
  }
  return 0;
}