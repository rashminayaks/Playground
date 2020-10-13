#include<iostream>
using namespace std;
int main()
{
  int a[3],count=0,n,i;
  cin>>a[0]>>a[1]>>a[2]>>n;
  for(i=0;i<3;i++)
    if(a[i]>=n)
      count++;
  cout<<count<<endl;
  return 0;  
}