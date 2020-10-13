#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,i;
  float res=0;
  cin>>n;
  if(n==1)
    cout<<"0.5";
  else
  {   
  for(i=0;i<n;i++)
  {
   res=0.5*pow(3,i);
    cout<<res<<" ";
  }
  }
  return 0;
}