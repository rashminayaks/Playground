#include<iostream>
using namespace std;
int main()
{
  int s,l;
  cin>>s>>l;
  int v=(s*s*s)*1000;
  if(l<=v)
  {
    cout<<"Can store"<<endl;
  }
  else
  {
    cout<<"Cannot store";
  }
  return 0;
}