#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int d=d1+d2;
  int c=c1+c2;
  if(c>=100)
  {
    d=d+1;
    c=c-100;
    cout<<d<<endl;
    cout<<c;
  }
  else{
    cout<<d<<endl;
    cout<<c;
  }
return 0;
}