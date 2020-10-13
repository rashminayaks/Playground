#include<iostream>
using namespace std;
int main()
{
  int n;
  string s;
  cin>>s>>n;
  string s1="front";
  string s2="rear";
  if(n==1 && s==s1 || n==0 && s==s2)
    cout<<"Left Handed";
  else
    cout<<"Right Handed";
  return 0;
}