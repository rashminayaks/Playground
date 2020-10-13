#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e;
  cin>>a>>b>>c>>d>>e;
  float a1,b1,c1,d1,e1;
  a1=a*350.34;
  b1=b*230.90;
  c1=c*190.55;
  d1=d*125.30;
  e1=e*180.90;
  float cost=(a1+b1+c1+d1+e1);
  if(cost<=15000)
  {
   cout<<"Yes";
  }
  else
    cout<<"No";
  return 0;
}