#include<iostream>
using namespace std;
int main()
{
  float m;
  int l,d;
  cin>>m>>l>>d;
  if((m*l)<=d)
  {
    cout<<"Cannot reach"<<endl;
  }
  else
    cout<<"Can reach";
  return 0;
}