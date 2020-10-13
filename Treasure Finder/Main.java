#include<iostream>
using namespace std;
int main()
{
  int a,b,c,n,d,i;
  cin>>a>>b>>c;
  d=a<b?(a<c?a:c):(b<c?b:c);
  for(i=d;i>=1;i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      n=i;
      break;
    }
  }
    if((a>b && a<c) || (a>c && a<b))
      cout<<"The treasure is in box which has number "<<a<<endl;
    else if((b>a && b<c) || (b<a && b>c))
      cout<<"The treasure is in box which has number "<<b<<endl;
  else
      cout<<"The treasure is in box which has number "<<c<<endl;
   cout<<"The code to open the box is "<<n;
  return 0;
}