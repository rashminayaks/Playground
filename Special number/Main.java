#include<iostream>
using namespace std;
int main()
{
  int m,n,i,sum,mul,f,l;
  cin>>m>>n;
  for(i=m;i<=n;i++)
  {
    f=i/10;
    l=i%10;
    sum=f+l;
    mul=f*l;
    if(sum+mul==i)
      cout<<i<<endl;
  }
return 0;  
}