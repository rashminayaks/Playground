#include<iostream>
using namespace std;
int main()
{
  int n,i,c=0,t,s=0;
  cin>>n;
  while(n>0)
  {
    cin>>t;
    n=n-t;
    c++;
  }
  cout<<"The number of turns is "<<c<<endl;
  return 0;
}