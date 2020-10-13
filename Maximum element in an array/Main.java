#include<iostream>
using namespace std;
int fmax(int a[],int n,int max);
int main()
{
  int n,i;
  cout<<"Enter the size of the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter "<<n<<" elements of an array"<<endl;
  for(i=0;i<n;i++)
    cin>>a[i];
  int max = a[n-1];
  int res=fmax(a,n-1,max);
  cout<<"Maximum element in the array is "<<res<<endl;
  return 0;
}
int fmax(int a[],int n,int max)
{
  if(n==0)
    return max;
  else
  {
   if(max<a[n-1])
   
     max=a[n-1];
   fmax(a,n-1,max);
   
  }
}