#include<iostream>
using namespace std;
int main()
{
  int i,row,col,n,r1,c1,flag=0;
  cin>>row>>col>>n;
 if(n<=row || n<=(2*row) || n<=(2*row+1))
   cout<<"Yes";
   else
     cout<<"No";
  return 0;
}