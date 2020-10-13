#include<iostream>
using namespace std;
int main()
{
  int n,f,l,p;
  cin>>n;
  f=n/10;
  l=n%10;
  p=f+l;
  cout<<"Alice must go in path-"<<p<<endl;
  return 0;
}