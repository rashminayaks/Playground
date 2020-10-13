#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
 int n,x,c=1,sum=0,sq,t=0,a=0,flag=0;
  cin>>n;
  sq=n*n;
  if(sq/10==0)
  {
    cout<<"Not a Kaprekar Number"<<endl;
  exit(0);
  }
  t=sq;
  while (t>9)
  {
    a=(a*100)+(t%10);
      t/=10;
    c*=10;
  }
  t=sq;
  while(c)
  {
    x=t/c;
    sum =x+(t%c);
    if(sum==n)
    {
      flag=1;
      break;
    }
    c/=10;
  }
  if(flag)
    cout<<"Kaprekar Number"<<endl;
  else
    cout<<"Not a Kaprekar Number"<<endl;
  return 0;      
}