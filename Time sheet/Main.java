#include<iostream>
using namespace std;
int main()
{
  int d1,d2,d3,d4,d5,d6,d7,t,n1=0,n2=0,hr,d;
  cin>>d1>>d2>>d3>>d4>>d5>>d6>>d7;
   t=d1*100+d2*100+d3*100+d4*100+d5*100+d6*100+d7*100;
  if(d1>0)
  {
    n1=(d1*(50/100.0)*100);
    t=t+n1;
  }
  if(d7>0)
  {
    n2=(d7*(25/100.0)*100);
    t=t+n2;
  }
  if(d1>8)
    t=((d1-8)*15)+t;
  if(d2>8)
    t=((d2-8)*15)+t;
  if(d3>8)
    t=((d3-8)*15)+t;
  if(d4>8)
    t=((d4-8)*15)+t;
  if(d5>8)
    t=((d5-8)*15)+t;
  if(d6>8)
    t=((d6-8)*15)+t;
  if(d7>8)
    t=((d7-8)*15)+t;
  cout<<t;
  return 0; 
}