#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int nb,tr,rs,bb;
  cin>>nb>>tr>>rs>>bb;
  int overs=50;
  cout<<overs<<endl;
  int rr=bb%6;
  float r=(bb/6)+(float)(0.1*rr);
  cout<<r<<endl;
  float crr=rs/r;
  printf("%0.1f\n",crr);
  printf("%0.1f\n",(tr/50.0));
  if(crr>(tr/50.0))
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  return 0;
}