#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int n,i,j,temp;
  cin>>n;
  int *a;
  a=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n-1;j++)
    {
      if(*(a+j)>*(a+j+1))
      {
        temp=*(a+j);
      *(a+j)=*(a+j+1);
      *(a+j+1)=temp;
      }
    }
  }
  cout<<"Sorted array is:"<<endl;
  for(i=0;i<n;i++)
  {
    cout<<*(a+i)<<endl;
  }
  return 0;
}