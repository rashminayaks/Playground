#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
 int i,n1,n2,*a,*b,sum1=0,sum2=0;
  cin>>n1>>n2;
  a=(int*)malloc(n1*sizeof(int));
  b=(int*)malloc(n2*sizeof(int));
  for(i=0;i<n1;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n2;i++)
  {
    cin>>*(b+i);
  }
  if(n1==n2)
  { 
    for(i=0;i<n1;i++)
    {
    sum1 += *(a+i);
    sum2 += *(b+i);
    }
    if(sum1==sum2)
      cout<<"Same";
    else
      cout<<"Not Same";
  }
  else
    cout<<"Not Same"<<endl;
  return 0;
}