#include<iostream>
using namespace std;
int search(int a[],int n,int i,int x);
int main()
{
  int n,i,x;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
 cin>>a[i];
  cin>>x;
    int res=search(a,0,n-1,x);
  (res==-1)?cout<<"The number is not present in the list":cout<<x;
  return 0;
}
  int search(int a[],int n,int i,int x)
  {
   if(i>=n)
   {
    int m=n+(i-n)/2;
     if(a[m]==x)
       return x;
     if(a[m]>x)
       return search(a,n,m-1,x);
     return search(a,m+1,i,x);
   }
    return -1;
}