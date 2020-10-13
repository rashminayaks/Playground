#include<iostream>
using namespace std;
int main()
{
  float x,y;
  cin>>x>>y;
  float cp=x;
  float sp=y*12;
  if(sp<cp)
  {
    float loss=cp-sp;
    cout<<"Loss : Rs."<<loss<<endl;
  }
  else if(sp>cp)
  {
    float profit=sp-cp;
  cout<<"Profit : Rs."<<profit<<endl;
  }
  else
    cout<<"No profit nor loss";
  return 0;
}