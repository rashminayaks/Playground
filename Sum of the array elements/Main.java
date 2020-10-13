#include<iostream>
using namespace std;
int sumOfarr(int a[],int n);
int main()
{
  int n,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
 int res=sumOfarr(a,n);
  cout<<res;
  return 0;
}
int sumOfarr(int a[],int n)
{
  if(n<=0)
    return 0;
  else
  return sumOfarr(a,n-1) + a[n-1];
}