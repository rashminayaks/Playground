#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int i,n,*a,max,min;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  min=(*a);
  max=(*a);
  for(i=1;i<n;i++)
  {
    if(max<*(a+i))
    {
      max=*(a+i);
    }
  }
   for(i=1;i<n;i++)
  {
    if(*(a+i)<min)
    {
      min=*(a+i);
    }
  }
  int range=max-min;
  cout<<"The range of the array is "<<range<<endl;
  return 0;
}