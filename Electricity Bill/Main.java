#include<iostream>
using namespace std;
int main()
{
 int units,cost;
  cin>>units;
  if(units<=200)
  {
   cost=units*0.5;
    cout<<"Rs."<<cost<<endl;
  }
  else if(units<=400)
  {
    cost=(units*0.65)+100;
    cout<<"Rs."<<cost<<endl;
  }
  else if(units<=600)
  {
    cost=(units*0.80)+200;
    cout<<"Rs."<<cost<<endl;
  }
  else 
  {
    cost=(units*1.25)+425;
    cout<<"Rs."<<cost;
  }
  return 0;
}