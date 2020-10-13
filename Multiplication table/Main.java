#include<iostream>
using namespace std;
int main()
{
  int n,m,i;
  cout<<"Enter n"<<endl;
  cout<<"Enter m"<<endl;
  cin>>n>>m;
  cout<<"The multiplication table of "<<n<<" is"<<endl;
  for(i=1;i<=m;i++)
  {
    int mul=i*n;
    cout<<i<<"*"<<n<<"="<<mul<<endl;
  }
  return 0;  
}