#include<iostream>
using namespace std;
int main()
{
  int total,x,y,x1,y1,p;
  int n,new1;
  cin>>total>>x>>y;
  x1 = (x/100.0)*total;
  cout<<x1<<endl;
  n=total-x1;
  y1= (y/100.0)*n;
  cout<<y1<<endl;
  new1=n-y1;
  p = new1/3;
  cout<<p;
  return 0;
}