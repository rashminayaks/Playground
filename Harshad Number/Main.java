#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,temp;
  cin>>n;
  temp=n;
  while(n!=0)
  {
   int m=n%10;
    sum+=m;
    n=n/10;
  }
  if(temp%sum==0)
  {
    cout<<"Harshad Number"<<endl;
  }
  else
  {
    cout<<"Not Harshad Number"<<endl;
  }
  return 0;
}