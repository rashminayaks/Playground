#include<iostream>
using namespace std;
int main()
{
  int n,i,r,count=0;
  cin>>n;
  if(n>99)
  {
  for(i=0;i<2;i++)
  {
    r=n%10;
    n=n/10;
  }
    if(r%3==0)
      cout<<"Trendy Number";
    else
    cout<<"Not a Trendy Number";
  }
  else
    cout<<"Not a Trendy Number";
    return 0;
}