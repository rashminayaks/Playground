#include<iostream>
using namespace std;
int main()
{
 int x,y,z;
  cin>>x>>y>>z;
 string lab;
  cin>>lab;
 if(lab=="L1")
  {
    (y<z)?cout<<"L2":cout<<"L3";
  }
 else if(lab=="L2")
 {
   (x<z)?cout<<"L1":cout<<"L3";
 }
else if(lab=="L3")
 {
   (x<y)?cout<<"L1":cout<<"L2";
 }
  else
    cout<<"Invalid";
  return 0;
}