#include<iostream>
using namespace std;
int main()
{
  int row,col,n;
  cin>>row>>col>>n;
  if((n>row)&&(n<=row*2) || ((n<=(row*col-row))&&(n>=(row*(row-2)))))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  return 0;
}