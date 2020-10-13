#include<iostream>
using namespace std;
int main()
{
 int a,b,i;
  float n=0,m=0;
  cin>>a>>b;
  for(i=1;i<=(a/2);i++)
    if(a%i==0)
      n+=i;
  for(i=1;i<=(b/2);i++)
    if(b%i==0)
      m+=i;
  float p=n/a;
  float q=m/b;
  if(p==q)
    cout<<"Friendly Pair";
  else
    cout<<"Not Friendly Pair";
  return 0;
}