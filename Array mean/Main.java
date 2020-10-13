#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int n,i,*a;
  int sum=0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
    sum+=*(a+i);
  }
  float mean=sum/(n*1.0);
  cout<<"The mean of the array is "<<mean<<endl;
  return 0;
}