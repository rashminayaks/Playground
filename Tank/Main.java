#include<iostream>
using namespace std;
int main()
{
  float r,h,hr,amt,vol;
  cin>>r>>h>>amt>>hr;
  vol=(float)3.14*r*r*h;
  if(amt*hr>=vol)
    cout<<"The tank can be filled within "<<hr<<" hours"<<endl;
  else
    cout<<"The tank cannot be filled within "<<hr<<" hours"<<endl;
  return 0;
}