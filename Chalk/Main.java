#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,i,m=1;
  cin>>n;
    m+=1/(sqrt(n))*n;
  int res=n+m;
  cout<<res;
  return 0;            
}