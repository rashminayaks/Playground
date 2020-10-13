#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int n,i,*a,s1=0,s2=0;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
    {
      s1+=*(a+i);
    }
   else
   {
     s2+=*(a+i);
   }
  }
  cout<<"The sum of the even numbers in the array is "<<s1<<endl;
  cout<<"The sum of the odd numbers in the array is "<<s2<<endl;
  return 0;
}