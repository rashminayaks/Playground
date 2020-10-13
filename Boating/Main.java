#include<iostream>
using namespace std;
int main()
{
  int w,a,b;
  cin>>w>>a>>b;
  int wgt=(a*75) +( b*30);
  if(wgt<=w)
  {
    cout<<"Boat is stable"<<endl;
  }
  else
    cout<<"Boat will drow";
}