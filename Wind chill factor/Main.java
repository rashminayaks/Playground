#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int t,v;
  float w,n;
  cin>>t>>v;
  n=pow(v,0.16);
  w=(35.74+(0.6215*t)) + ((0.4275*t)-35.75) * n;
  cout<<w;
  return 0;
}