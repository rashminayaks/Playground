#include<iostream>
#include<bits/stdc++.h>
using namespace std;
void sortString(string &str)
{
 sort(str.begin(),str.end()); 
  cout<<"The output string is "<<str;
}
int main()
{
  string s;
  cin>>s;
  sortString(s);
   //cout<<"The output string is "<<sortString(s);
  return 0;
}