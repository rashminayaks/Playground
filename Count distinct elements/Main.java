#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int i,j,n,*a,count=0;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(*(a+i)==*(a+j))
       *(a+j)=0;
    }
  }
  for(i=0;i<n;i++)
  {
    if(*(a+i)!=0)
       count++;
  }
  cout<<"There are "<<count<<" distinct element in the array.";
  return 0;
}