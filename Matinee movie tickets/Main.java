#include<iostream>
using namespace std;
int main()
{
  int age;
  float time;
  cin>>age;
  cin>>time;
  if(age>13 && time>12)
      cout<<"$"<<"5.00"<<endl;
  else if(age>13 && time<12)
      cout<<"$"<<"8.00"<<endl;
  else if(age<13 && time>12)
      cout<<"$"<<"2.00"<<endl;
    else
      cout<<"$"<<"4.00"<<endl;
  return 0;
}