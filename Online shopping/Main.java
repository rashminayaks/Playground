#include<iostream>
using namespace std;
int main()
{
  int a1,d1,s1,a2,d2,s2,a3,d3,s3;
  cin>>a1>>d1>>s1>>a2>>d2>>s2>>a3>>d3>>s3;
  float p1= s1+(a1-((d1/100.0)*a1));
  float p2= s2+(a2-((d2/100.0)*a2));
  float p3= s3+(a3-((d3/100.0)*a3));
  cout<<"In Flipkart Rs."<<p1<<endl;
  cout<<"In Snapdeal Rs."<<p2<<endl;
  cout<<"In Amazon Rs."<<p3<<endl;
  if(p1<p2&&p1<p3)
    cout<<"He will prefer Flipkart"<<endl;
  else if(p2<p1&&p2<p3)
  cout<<"He will prefer Snapdeal"<<endl;
  else if(p3<p1&&p3<p2)
    cout<<"He will prefer Amazon"<<endl;
  else 
    cout<<"He will prefer Flipkart";
  return 0;
}