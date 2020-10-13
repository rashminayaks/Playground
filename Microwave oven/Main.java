#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int n,t;
  float time;
  cin>>n>>t;
  if(n==2)
  {
    time=t+(0.5*t);
    printf("%.2f",time);
  }
  else if(n==3)
  {
    time=2*t;
     printf("%.2f",time);
  }
  else if(n>3)
    cout<<"Number of items is more";
  else
    cout<<t<<endl;
  return 0;
}