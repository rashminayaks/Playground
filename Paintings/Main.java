#include<iostream>
using namespace std;
int main()
{
  int l,b,l1,b1,l2,b2;
  cin>>l>>b>>l1>>b1>>l2>>b2;
  int area=l*b;
  int a1=l1*b1;
  int a2=l2*b2;
  int n=a1+a2;
  if(n<=area)
    cout<<"Raj can fix both painting";
  else
    cout<<"Raj cannot fix both painting";
  return 0;
}