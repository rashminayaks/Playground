#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  float p=0;
  cin>>n;
  while(n>0)
  {
    cin>>n;
    if(n%2!=0)
    {
      p=p+1;
      c++;
      if(c==3)
        break;
    }
    else
      p=p-0.5;
  }
  if(n<0)
    p=p-1;
  cout<<p;
  return 0;
}