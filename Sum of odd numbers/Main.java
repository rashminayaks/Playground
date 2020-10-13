#include<iostream>
using namespace std;
int sumOfodd(int a[],int n,int sum);
int main()
{
  int n,sum=0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  cin>>a[i];
  int res=sumOfodd(a,n,sum);
  cout<<"The sum of the odd elements in the array is "<<res<<endl;
  return 0;
}
int sumOfodd(int a[],int n,int sum)
{
  if(n<0)
    return sum;
  if(a[n]%2!=0)
    sum+=a[n];
  sumOfodd(a,n-1,sum); 
}