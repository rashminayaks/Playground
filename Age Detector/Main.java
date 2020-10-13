#include<iostream>
using namespace std;
int main()
{
  int by,cy;
  cin>>by>>cy;
  if(cy==0)
    cout<<(100-by)<<endl;
  else if(cy<by)
    cout<<(cy+100)-by<<endl;
  else
    cout<<(cy-by)<<endl;
  return 0;
}