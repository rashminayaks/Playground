#include<iostream>
using namespace std;
int main()
{
  float p1,p2,ta,dp,as;
  int d;
  cin>>p1>>p2;
  cin>>d;
  ta=p1+p2;
  cout<<ta<<endl;
  dp=((d/100.0)*p1) + ((d/100.0)*p2); 
  cout<<(ta-dp)<<endl;
  cout<<dp;
  return 0;
}