#include<iostream>
using namespace std;
int main()
{
  int n,result,f,l;
  cin>>n;
  f=n/1000;
  l=n%10;
  result=f+l;
  cout<<result;
  return 0;
}