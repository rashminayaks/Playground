#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str,word=" the";
  getline(cin,str);
  for(int i=0;i<str.length()-4;i++)
  {
    if(str.substr(i,4)==word)
      str.replace(i,4,"");
  }
  cout<<str;
  return 0;
}