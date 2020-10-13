#include<iostream>
using namespace std;
int main()
{
  float speed,dist,time;
  cin>>speed>>dist>>time;
  float t=(dist/speed)*3600;
  if(t<=time)
  {
    cout<<"Yes"<<endl;
  }
  else
    cout<<"No";
  return 0;
}